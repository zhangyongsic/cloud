package com.qlc.cloud.study.reflect;

import com.qlc.cloud.entitys.sys.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * author:zhangyong
 * Date:2019/3/1
 * Time:10:54
 * 反射
 */
public class ReflectMain {

    public static void main(String[] args) throws Exception{
        Class<User> userClass = User.class;

        //获取构造方法，设置可使用
        Constructor<User> constructor = userClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        User user = constructor.newInstance();
        Field[] fields = userClass.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f.getName());
        }
        Field field = userClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(user,"zxj");
        System.out.println(user.getName());
    }
}
