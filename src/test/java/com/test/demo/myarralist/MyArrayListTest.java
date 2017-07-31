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


    /**
     * 集合的自动扩容
     */
    @Test
    public void testAdd(){
        MyArrayList<String> strings = new MyArrayList<String>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("g");
        strings.add("h");
        strings.add("i");
        strings.add("j");
        strings.add("k");//集合中数组扩容
    }

    @Test
    public void test(){
        //右移n代表：除以2的n次幂，取整
        System.out.println(1 >> 1);
        System.out.println(12 >> 1);
        System.out.println(13 >> 1);
        System.out.println(2 >> 2);
        System.out.println(8 >> 2);

        //左移n代表:乘以2的n次幂
        System.out.println(2 << 2);
        System.out.println(2 << 3);
    }

}
