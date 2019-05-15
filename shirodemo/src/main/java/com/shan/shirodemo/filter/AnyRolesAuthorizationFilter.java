package com.shan.shirodemo.filter;

import com.google.gson.Gson;
import com.publib.utils.ResultUtils;
import com.shanghao.publib.ResultEnum;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.http.HttpStatus;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AnyRolesAuthorizationFilter  extends AuthorizationFilter {
    private final Logger log = LoggerFactory.getLogger(AnyRolesAuthorizationFilter.class);
	
	@Override
    protected void postHandle(ServletRequest request, ServletResponse response){
		request.setAttribute("anyRolesAuthFilter.FILTERED", true);
	}

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object mappedValue) throws Exception {
    	Boolean afterFiltered = (Boolean)(servletRequest.getAttribute("anyRolesAuthFilter.FILTERED"));
        if( BooleanUtils.isTrue(afterFiltered))
        	return true;
        
        Subject subject = getSubject(servletRequest, servletResponse);
        String[] rolesArray = (String[]) mappedValue;
        if (rolesArray == null || rolesArray.length == 0) { //没有角色限制，有权限访问
            return true;
        }
        for (String role : rolesArray) {
            if (subject.hasRole(role)) //若当前用户是rolesArray中的任何一个，则有权限访问
                return true;
        }
        log.error("No permission");
        PrintWriter out = null;
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("application/json; charset=utf-8");
        out = servletResponse.getWriter();
        out.append(new Gson().toJson(ResultUtils.error(ResultEnum.NO_PERMISSION.getCode(), ResultEnum.NO_PERMISSION.getMsg())));
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
        HttpServletResponse httpResponse = WebUtils.toHttp(response);
        httpResponse.setCharacterEncoding("UTF-8");
        httpResponse.setContentType("application/json;charset=utf-8");
        httpResponse.setStatus(HttpStatus.SC_UNAUTHORIZED);
        return false;
    }

}
