package com.shanghao.publib;

public enum ResultEnum {
    SUCCESS(0,"请求成功"),
    UNKONW_ERROR(-1,"未知错误"),
    TOKEN_PAST_DUE(201,"token已过期"),
    TOKEN_INVALID(202,"token无效"),
    NO_TOKEN(203,"token没传"),
    TOKEN_LOGOUT(204,"你的账号已在其他设备登录"),
    REQUEST_ERROR(205,"请求失败(如：某个字段没传)"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
