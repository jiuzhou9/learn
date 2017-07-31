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
     * 第一种构造：无参构造
     * 构造出一个集合
     * 集合中维护一个可变数组，数组长度为10
     */
    @Test
    public void testConstructor01(){
        //集合初始化默认里面会有一个容量为10的数组，该数组就是集合中的真正容器
        MyArrayList<String> strings = new MyArrayList();
    }

    /**
     * 第二种构造：参数类型是int
     * 构造出一个集合
     * 集合中维护一个数组，数组长度是指定的
     */
    @Test
    public void testConstructor02(){
        //有参数构造，参数是容量值
        MyArrayList<String> strings = new MyArrayList(19);
    }

    /**
     * 第三种构造：参数是collection类型
     * 构造一个集合
     * 该集合中维护一个数组
     * 构造器中会将参数（old集合）数组化，赋值给新集合中的新数组
     * 新数组长度就是老数组的长度
     * 新集合长度就是老数组的长度
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
     * 在扩容的过程中使用了Arrays.copyOf方法，将原数组中的数组复制到新的数组中
     * 然后在新数组中进行添加新的元素
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
