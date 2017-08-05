package com.test.demo.thread.waitandnotify;

/**
 * Created by jiuzhou on 2017/8/5.
 */
public class ThreadWN implements Runnable {

    public final static Integer count = 0;
    public void run() {
        System.out.println("T1 start");
        //获取对象监视器
        synchronized (count){
            try {
                System.out.println("T1 wait");
                //会释放当前的监视器
                count.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("T1 end");
    }
}