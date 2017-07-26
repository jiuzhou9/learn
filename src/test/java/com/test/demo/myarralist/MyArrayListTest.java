package com.test.demo.myarralist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by 01210368 on 2017/7/21.
 */
public class MyArrayListTest {

    /**
     * 第一种构造
     */
    @Test
    public void testConstructor01(){
        //集合初始化默认里面会有一个容量为10的数组，该数组就是集合中的真正容器
        MyArrayList<String> strings = new MyArrayList();
    }

    /**
     * 第二种构造
     */
    @Test
    public void testConstructor02(){
        //有参数构造，参数是容量值
        MyArrayList<String> strings = new MyArrayList(19);
    }

    /**
     * 第三种构造
     */
    @Test
    public void testConstructor03(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        //新构造的集合中的数组容器将会有list中的元素
        MyArrayList<String> strings = new MyArrayList<String>(list);
    }

}
