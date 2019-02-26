package com.qlc.cloud.components.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/**
 * author:zhangyong
 * Date:2019/2/25
 * Time:11:18
 */
public class ThreadTest {

    public static void main(String[] args) throws Exception{
//        test2();
        rr();
    }

    private static void test() throws Exception{
        final Lock lock = new ReentrantLock();
        final Lock lock2 = new ReentrantLock();
        Thread.sleep(1000);
        lock.lock();
        Thread thread = new Thread(new Runnable() {
            public void run() {
                lock.lock();
                System.out.println("this is test");
            }
        });

        thread.start();
//        Thread.sleep(1000);
        System.out.println("sleep");
        thread.interrupt();
        Thread.sleep(2000);
        System.out.println("2000");
    }

    private static void test2() throws Exception{
        final Lock lock = new ReentrantLock();
        final Lock lock2 = new ReentrantLock();
        lock.lock();
        Thread.sleep(1000);

        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    lock.lockInterruptibly();
                    System.out.println("false werwrwerw");
                }catch (InterruptedException e){
                    e.getMessage();
                    System.out.println("false");
                }

                System.out.println("this is test");
            }
        });

        thread.start();
        Thread.sleep(1000);
        System.out.println("sleep");
        thread.interrupt();
        Thread.sleep(2000);
        System.out.println("2000");
    }

    private static void ww() throws Exception{
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReadLock readLock = lock.readLock();
        final WriteLock writeLock = lock.writeLock();
        writeLock.lock();
        Thread.sleep(1000);

        Thread thread = new Thread(new Runnable() {
            public void run() {
                writeLock.lock();
                System.out.println("false werwrwerw");
                System.out.println("this is test");
            }
        });

        thread.start();
        Thread.sleep(1000);
        System.out.println("sleep");
        thread.interrupt();
        Thread.sleep(2000);
        System.out.println("2000");
    }

    private static void rr() throws Exception{
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        final ReadLock readLock = lock.readLock();
        readLock.lock();
        Thread.sleep(1000);

        Thread thread = new Thread(new Runnable() {
            public void run() {
                readLock.lock();
                System.out.println("rr this is test");
            }
        });

        thread.start();
        Thread.sleep(1000);
        System.out.println("sleep");
        thread.interrupt();
        Thread.sleep(2000);
        System.out.println("2000");
    }
}
