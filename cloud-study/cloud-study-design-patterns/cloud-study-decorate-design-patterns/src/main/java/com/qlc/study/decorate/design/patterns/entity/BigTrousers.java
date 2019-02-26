package com.qlc.study.decorate.design.patterns.entity;

/**
 * author:zhangyong
 * Date:2019/2/26
 * Time:13:52
 */
public class BigTrousers extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.print("穿大跨库");
    }
}
