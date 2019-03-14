package com.qlc.cloud.study.single;

/**
 * author:zhangyong
 * Date:2019/3/13
 * Time:16:40
 */
public enum  EnumSingle {
    INSTANCE;
    public static EnumSingle getInstance(){
        return INSTANCE;
    }

}
