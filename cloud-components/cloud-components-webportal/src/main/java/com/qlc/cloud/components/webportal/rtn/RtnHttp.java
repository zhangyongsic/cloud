package com.qlc.cloud.components.webportal.rtn;

import com.qlc.cloud.components.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * author:zhangyong
 * Date:2019/2/20
 * Time:17:27
 */
@Data
public class RtnHttp<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    private RtnHttp(){}

    public static <T> RtnHttp<T> ok(){
        return ok(null);
    }

    public static RtnHttp<ErrorCode> error(String msg){
        ErrorCode errorCode = ErrorCode.UNKNOWN_ERROR;
        errorCode.setMsg(msg);
        return error(errorCode);
    }

    public static RtnHttp<ErrorCode> error(ErrorCode errorCode){
        return result(errorCode,null);
    }

    public static <T> RtnHttp<T> ok(T data){
        return result(ErrorCode.SUCCESS,data);
    }

    public static <T> RtnHttp<T> result(ErrorCode errorCode, T data) {
        RtnHttp result = new RtnHttp();
        result.setCode(errorCode.getCode());
        result.setMsg(errorCode.getMsg());
        result.setData(data);
        return result;
    }
}
