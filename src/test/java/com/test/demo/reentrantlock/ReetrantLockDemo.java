package com.test.demo.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jiuzhou on 2017/8/12.
 */
public class ReetrantLockDemo implements Runnable {
    private static ReentrantLock reentrantLock = new ReentrantLock();
    public static int j = 0;

    /**
     * 如果没有lock这个机制就会出现线程不安全现象
     * 注意lock后必须unlock
     * lock几次就unlock几次
     * 该机制支持“可中断”“可重入”“可限时”，意味着当该线程长时间持有资源可以中断
     */
    public void run() {
        for (int i = 0; i < 10000; i++){
            reentrantLock.lock();
//            reentrantLock.lockInterruptibly();可中断加锁
            try {
                j++;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        ReetrantLockDemo.j = j;
    }
}
