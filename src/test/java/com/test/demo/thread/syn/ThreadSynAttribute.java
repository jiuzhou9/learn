package com.test.demo.thread.syn;

/**
 * Created by jiuzhou on 2017/8/5.
 * 锁目标：对象属性上，所以在线程调用时必须保证进来的是同一个对象
 */
public class ThreadSynAttribute implements Runnable {
    //静态的保证对象唯一
    public ThreadSynAttribute threadSyn = new ThreadSynAttribute();
    public Integer count = 0;
    public Single single = new Single();


    public void run() {
        for (int j = 0; j < 10000; j++){
//            increase();
            synchronized (count){
                System.out.println("对象属性");
            }
        }
    }

    public ThreadSynAttribute getThreadSyn() {
        return threadSyn;
    }

    public void setThreadSyn(ThreadSynAttribute threadSyn) {
        this.threadSyn = threadSyn;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Single getSingle() {
        return single;
    }

    public void setSingle(Single single) {
        this.single = single;
    }
}
