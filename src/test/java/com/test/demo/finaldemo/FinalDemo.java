package com.test.demo.finaldemo;

/**
 * Created by jiuzhou on 2017/8/5.
 * final修饰的属性不能改变，所以不会提供setter方法
 * final修饰的方法不能重写
 */
public class FinalDemo {
    private final int i = 0;
    public final void show(){
        System.out.println(1);
    }

    public int getI() {
        return i;
    }
}
