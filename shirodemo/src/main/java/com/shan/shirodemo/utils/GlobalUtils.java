package com.shan.shirodemo.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class GlobalUtils {
    /**
     * 获取当前请求session
     *
     * @return
     */
    public static HttpServletRequest getHttpServletRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes())
                .getRequest();
        return request;
    }

    /**
     * 获取用户id
     *
     * @return
     */
    public static String getUid() {
        return (String) getHttpServletRequest().getAttribute("uid");
    }

    /**
     * 获取用户id
     *
     * @return
     */
    public static String getToken() {
        return (String) getHttpServletRequest().getAttribute("token");
    }
}
