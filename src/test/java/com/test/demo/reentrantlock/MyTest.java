package com.test.demo.reentrantlock;

import org.junit.Test;

/**
 * Created by jiuzhou on 2017/8/12.
 */
public class MyTest {

    @Test
    public void test01(){
        ReetrantLockDemo reetrantLockDemo = new ReetrantLockDemo();
        Thread thread = new Thread(reetrantLockDemo);
        Thread thread1 = new Thread(reetrantLockDemo);
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(reetrantLockDemo.j);
    }
}
