package com.qlc.cloud.study.design.patterns.proxy;

/**
 * author:zhangyong
 * Date:2019/2/26
 * Time:15:50
 */
public class RealSubject extends Subject {

    protected void request() {
        System.out.println("RealSubject");
    }
}
