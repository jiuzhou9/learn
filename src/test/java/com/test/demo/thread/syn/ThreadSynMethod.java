package com.test.demo.thread.syn;

/**
 * Created by jiuzhou on 2017/8/5.
 * 锁目标：对象级别的方法上，所以在线程调用时必须保证进来的是同一个对象
 */
public class ThreadSynMethod implements Runnable {
    //静态的保证对象唯一
    public static ThreadSynMethod threadSyn = new ThreadSynMethod();
    public static Integer count = 0;
    public static Single single = new Single();

    //同步锁目标：对象的方法上（类实例方法上）
    //必须要保证进来的对象是同一个对象，这样锁在方法上才能生效
    public synchronized void increase(){
        count++;
    }

    public void run() {
        for (int j = 0; j < 10000; j++){
            increase();
        }
    }
}
