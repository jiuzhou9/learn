package com.test.demo.thread;

/**
 * Created by jiuzhou on 2017/5/28.
 */
public class ThreadNO1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + i);
        }
    }
}
