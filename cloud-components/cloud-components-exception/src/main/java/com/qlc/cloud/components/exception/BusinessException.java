package com.qlc.cloud.components.exception;


/**
 * 业务异常
 * author:zhangyong
 * Date:2019/1/5
 * Time:11:47
 */
public class BusinessException extends RuntimeException {

    private ErrorCode errorCode;

    public BusinessException() {
        this(ErrorCode.UNKNOWN_ERROR);
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
