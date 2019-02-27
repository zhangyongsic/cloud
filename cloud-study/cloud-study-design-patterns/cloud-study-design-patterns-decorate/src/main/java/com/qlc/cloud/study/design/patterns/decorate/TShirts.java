package com.qlc.cloud.study.design.patterns.decorate;

/**
 * author:zhangyong
 * Date:2019/2/27
 * Time:19:18
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        super.show();
        System.out.println("TShirts");
    }
}
