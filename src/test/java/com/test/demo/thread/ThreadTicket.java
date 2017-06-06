package com.test.demo.thread;

/**
 * Created by jiuzhou on 2017/5/28.
 */
public class ThreadTicket extends Thread{

    private int t = 10;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (t > 0){
                System.out.println(getName() + "执行，剩余票数" + t--);
            }else {
                break;
            }
        }
    }

}
