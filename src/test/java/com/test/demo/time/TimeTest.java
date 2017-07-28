package com.test.demo.time;

import org.junit.Test;

import java.util.Date;

/**
 * Created by 01210368 on 2017/7/28.
 * 时间测试类
 */
public class TimeTest {

    @Test
    public void test(){
        String string = DateUtil.dateToString(new Date());
        System.out.println(string);
    }


}
