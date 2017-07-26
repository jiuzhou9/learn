package com.test.demo.myarralist;

import org.junit.Test;



/**
 * Created by 01210368 on 2017/7/21.
 */
public class ArrayListTest {

    @Test
    public void testConstructor01(){
        //集合初始化默认里面会有一个容量为10的数组，该数组就是集合中的真正容器
        MyArrayList<String> strings = new MyArrayList();
    }

}
