package com.qlc.cloud.study.design.patterns.decorate;

/**
 * author:zhangyong
 * Date:2019/2/27
 * Time:19:15
 * 服饰
 */
public abstract class Finery extends Person{

    protected Person person;

    protected void decorate(Person person){
        this.person = person;
    }

    public void show() {
        if (person!=null){
            person.show();
        }
    }
}
