package com.test.demo.thread.syn;

/**
 * Created by jiuzhou on 2017/8/5.
 * 锁目标：类级别上，类方法上
 */
public class ThreadSyn2 implements Runnable {
    //静态属性是类级别
    public static ThreadSyn2 threadSyn = new ThreadSyn2();
    public static Integer count = 0;
    public static Single single = new Single();
    //同步锁目标：类级别的方法上
    public static synchronized void increase(){
        count++;
    }

    public void run() {
        for (int j = 0; j < 10000; j++){
            increase();
        }
    }
}
