package com.test.demo.thread;

import org.junit.Test;

/**
 * Created by jiuzhou on 2017/5/28.
 */
public class Demo {
    /**
     * 继承Thread的方式创建线程
     * 测试join方法作用
     */
    @Test
    public void testJoin(){
        ThreadNO1 t1 = new ThreadNO1();
        ThreadNO1 t2 = new ThreadNO1();
        t1.setName("我是第一号线程");
        t2.setName("我是第二号线程");
        t1.start();
        t2.start();
        /*-------------------------------*/
        //join方法：当方法所在前线程A等待线程B(调用join的线程)执行完毕再往下执行；
        // 如果没有join方法，线程A不会等待线程B执行完毕就会往下执行
        //换句话说就是有join就是异步变同步，如果没有join就是异步线程
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*-------------------------------*/
        System.out.println(t1.isAlive());
    }

    /**
     * 实现runnable接口方式创建线程
     * 测试join方法作用
     */
    @Test
    public void testRunnable(){
        RunnableNO1 r1 = new RunnableNO1();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.setName("第一条线程");
        t2.setName("第二条线程");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t1.isAlive());
    }
}
