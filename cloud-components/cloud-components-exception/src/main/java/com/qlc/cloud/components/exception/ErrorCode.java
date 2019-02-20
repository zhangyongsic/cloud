package com.qlc.cloud.components.exception;

/**
 * author:zhangyong
 * Date:2019/2/20
 * Time:17:03
 * 系统错误码
 */
public enum  ErrorCode {
    SUCCESS(0,"操作成功"),
    UNKNOWN_ERROR(-1,"未知错误"),
    PARAMS_ERROR(1,"参数错误"),
    ;
    private Integer code;
    private String msg;

    private ErrorCode(){}
    private ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
