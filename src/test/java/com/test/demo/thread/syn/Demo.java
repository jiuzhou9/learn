package com.test.demo.thread.syn;

import org.junit.Test;

/**
 * Created by jiuzhou on 2017/8/5.
 * synchronized(同步锁)
 * 两种方式：
 *  方式一：类级别（static修饰的 类级别属性、类级别方法）
 *  方式二：对象级别（非静态的 对象级别属性、对象级别方法）
 */
public class Demo {
    /*
    锁目标：类级别-->属性
    传什么无所谓：new ThreadSyn()可以
     */
    @Test
    public void test(){
        //传什么无所谓
        Thread thread1 = new Thread(new ThreadSyn());
        Thread thread2 = new Thread(new ThreadSyn());
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ThreadSyn.count);
    }

    /*
    锁目标：类级别-->方法上
    传什么无所谓
     */
    @Test
    public void test02(){
        //传什么无所谓
        Thread thread1 = new Thread(new ThreadSyn2());
        Thread thread2 = new Thread(new ThreadSyn2());
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ThreadSyn2.count);
    }

    /*
    锁目标：对象级别-->方法上
    必须保证进去的是同一个对象，这样锁的才能是同一个方法，锁才能生效
    可以是：threadSynMethod、ThreadSynMethod.threadSyn对象统一即可
     */
    @Test
    public void test01(){
        ThreadSynMethod threadSynMethod = new ThreadSynMethod();
        Thread thread1 = new Thread(ThreadSynMethod.threadSyn);
        Thread thread2 = new Thread(ThreadSynMethod.threadSyn);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ThreadSynMethod.count);
    }

    /*
    锁目标：对象级别-->属性
    无法实现
     */
    @Test
    public void test03(){
        ThreadSynAttribute threadSynAttribute = new ThreadSynAttribute();
        Thread thread1 = new Thread(threadSynAttribute);
        Thread thread2 = new Thread(threadSynAttribute);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadSynAttribute.getCount());
    }
}
