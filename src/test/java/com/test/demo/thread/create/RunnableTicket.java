package com.test.demo.thread.create;

/**
 * Created by jiuzhou on 2017/5/28.
 */
public class RunnableTicket implements Runnable {
    private int t = 10;
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (t > 0){
                System.out.println(Thread.currentThread().getName() + "执行，剩余票数" + t--);
            }else {
                break;
            }
        }
    }
}
