package com.test.demo.myarralist;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
     * 集合在进行add的时候会进行检测，如果添加元素后的数组长度（oldLength+1）大于原数组的长度（oldLength）
     * 会进行自动扩容：新的数组长度为  oldLength + oldLength/2
     *
     * 在扩容的过程中使用了   Arrays.copyOf方法
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

    /**
     * Arrays.copyOf方法
     * 第一个参数为   oldArray
     * 第二个参数为   newArraySize
     *
     * 也就是说将原数组（oldArray）中的数据拷贝到一个新数组（newArray）中
     * 这个新数组的长度就是 newArraySize
     */
    @Test
    public void testArrayCopyOf(){
        int[] array = new int[]{1,2,3,4};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        array = Arrays.copyOf(array, 5);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
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
