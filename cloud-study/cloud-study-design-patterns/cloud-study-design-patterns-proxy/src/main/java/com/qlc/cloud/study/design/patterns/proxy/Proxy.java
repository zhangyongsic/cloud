package com.qlc.cloud.study.design.patterns.proxy;

/**
 * author:zhangyong
 * Date:2019/2/26
 * Time:15:44
 */
public class Proxy extends Subject{

    private RealSubject realSubject;
    protected void request() {

        if (realSubject!=null){
            realSubject = new RealSubject();
        }

        realSubject.request();
    }
}
