package com.test.demo.thread;

/**
 * Created by jiuzhou on 2017/5/28.
 */
public class RunnableNO1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
