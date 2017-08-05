package com.test.demo.thread.waitandnotify;

/**
 * Created by jiuzhou on 2017/8/5.
 */
public class ThreadWN2 implements Runnable {

    public void run() {
        System.out.println("T2 start");
        //获取对象监视器
        synchronized (ThreadWN.count){
            System.out.println("T2 start,notify T1");
            //唤醒wait状态的线程
            ThreadWN.count.notify();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("T2 end");
    }
}