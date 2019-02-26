package com.qlc.study.decorate.design.patterns.entity;

/**
 * author:zhangyong
 * Date:2019/2/26
 * Time:13:32
 */
public class Finery extends Person{

    protected Person person;

    public void decorate(Person person){
        this.person = person;
    }

    public void show() {
        if (person!=null){
            person.show();
        }
    }
}

