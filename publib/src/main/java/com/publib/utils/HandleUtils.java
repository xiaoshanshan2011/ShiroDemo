package com.publib.utils;


import com.publib.bean.Result;
import com.publib.constant.BaseConstants;

/**
 * @Author: chenjunshan
 * @Date: 19-1-3 下午6:23
 */
public class HandleUtils {

    /**
     * 是否操作成功
     * @param status
     * @return
     */
    public static Result isSuccess(int status){
        if (status == 1) {
            return ResultUtils.success();
        } else {
            return ResultUtils.error(BaseConstants.RE_ERROR, "请求失败");
        }
    }
}
