package com.publib.utils;


import com.publib.bean.Result;
import com.shanghao.publib.ResultEnum;

public class ResultUtils {

    /**
     * 请求成功统一处理
     *
     * @return
     */
    public static Result success() {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData("");
        return result;
    }

    /**
     * 请求成功统一处理
     *
     * @param object
     * @return
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    /**
     * 请求成功统一处理
     *
     * @param msg
     * @return
     */
    public static Result successMsg(String msg) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(msg);
        result.setData("");
        return result;
    }

    /**
     * 请求成功统一处理
     *
     * @param msg
     * @return
     */
    public static Result successMsgAndData(String msg, Object object) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    /**
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * @param msg
     * @return
     */
    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(ResultEnum.REQUEST_ERROR.getCode());
        result.setMsg(msg);
        return result;
    }
}
