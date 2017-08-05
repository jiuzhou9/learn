package com.test.demo.thread.create;

/**
 * Created by jiuzhou on 2017/5/28.
 */
public class RunnableNO1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            if (Thread.currentThread().isInterrupted()){
                System.out.println("线程中断标记存在");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                //一般都是因为外面命令此线程中断，才会有异常InterruptedException的，才会走到catch的
                e.printStackTrace();
                //在catch中是无法检测到线程中断的状态的
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }
    }
}
