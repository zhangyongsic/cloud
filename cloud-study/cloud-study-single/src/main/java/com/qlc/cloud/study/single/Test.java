package com.qlc.cloud.study.single;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * author:zhangyong
 * Date:2019/3/13
 * Time:15:28
 */
public class Test {

    public static void main(String[] args) throws Exception{
//        lazyTest();
//        enumTest();
        lazySer();
    }


    public static void lazyTest() throws Exception{
        Constructor<LazySingle> singleConstructor = LazySingle.class.getDeclaredConstructor();
        singleConstructor.setAccessible(true);
        LazySingle single1 = singleConstructor.newInstance();
        LazySingle single2 = singleConstructor.newInstance();
        System.out.println(single1==single2);
    }

    public static void enumTest() throws Exception{

        EnumSingle enumSingle = EnumSingle.getInstance();
        EnumSingle enumSingle2 = EnumSingle.getInstance();
//        Constructor<EnumSingle> enumSingleConstructor = EnumSingle.class.getDeclaredConstructor();
        Constructor<EnumSingle> enumSingleConstructor2 = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        enumSingleConstructor2.setAccessible(true);
        EnumSingle single = enumSingleConstructor2.newInstance("test",1);
        System.out.println(enumSingle==enumSingle2);
        System.out.println(enumSingle==single);
    }

    public static void lazySer() throws Exception{
        LazySingle s = LazySingle.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SerSingleton.obj"));
        oos.writeObject(s);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("SerSingleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        LazySingle s1 = (LazySingle)ois.readObject();

        System.out.println(s==s1);
    }

}
