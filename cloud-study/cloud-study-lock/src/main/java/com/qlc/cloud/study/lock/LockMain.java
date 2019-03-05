package com.qlc.cloud.study.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * author:zhangyong
 * Date:2019/3/1
 * Time:11:25
 */
public class LockMain {

    public static class LockThread extends Thread{

        private Lock lock;

        public LockThread(Lock lock,String name){
            this.lock = lock;
            super.setName(name);
        }

        public void run() {
            try {
                if (lock.tryLock(3000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName()+"获取锁");
                    Thread.sleep(4000);
                }else {
                    System.out.println(Thread.currentThread().getName()+"没有获取锁");
                }
            }catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName()+"异常释放锁");
            }finally {
                System.out.println(Thread.currentThread().getName()+"执行完毕释放锁");
                lock.unlock();
            }

        }
    }

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        LockThread lockThread1 = new LockThread(lock,"thread1");
        LockThread lockThread2 = new LockThread(lock,"thread2");

        lockThread1.start();
        lockThread2.start();

    }
}
