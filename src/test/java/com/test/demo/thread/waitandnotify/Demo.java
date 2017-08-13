package com.test.demo.thread.waitandnotify;

import org.junit.Test;

/**
 * Created by jiuzhou on 2017/8/5.
 * 如果T1线程先执行了才是我的理想状态：
 * 此时T1在执行过程中会有一个wait状态，
 * 此时T1会释放监视器资源
 * 此时T2才可以获取监视器资源，T2执行过程中会notify T1，
 *
 * 但是T1需要等待T2执行完毕释放监视器资源，T1才可以执行。
 * 此时可以发现
 *   T1 start           -->理想状态T1先执行，获取监视器资源
 *   T1 wait            -->T1被wait了，此时T1释放监视器资源
 *   T2 start           -->T2执行，并获取监视器资源
 *   T2 start,notify T1 -->T2唤醒T1,但是此时T2仍然持有监视器，T1虽然被唤醒但是在等待监视器资源
 *   T2 end             -->T2执行结束，释放监视器资源
 *   T1 end             -->T获取资源，继续执行
 */
public class Demo {
    @Test
    public void test(){
        Thread T1 = new Thread(new ThreadWN());
        Thread T2 = new Thread(new ThreadWN2());
        T1.start();
        T2.start();
        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
