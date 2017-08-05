package com.test.demo.thread.syn;

/**
 * Created by jiuzhou on 2017/8/5.
 * 锁目标：类级别上，类属性上
 */
public class ThreadSyn implements Runnable {
    //静态属性是类级别
    public static ThreadSyn threadSyn = new ThreadSyn();
    public static Integer count = 0;
    public static Single single = new Single();

    public void run() {
        for (int j = 0; j < 10000; j++){
            //同步锁目标：类级别
            synchronized (single){
                count++;
            }
        }
    }
}
