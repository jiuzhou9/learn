package com.test.demo.myhashmap;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by jiuzhou on 2017/8/4.
 */
public class TestHashmap {

    /**
     * hashMap中存放相同的键不同的值的时候会发生覆盖
     */
    @Test
    public void test(){
        HashMap<String,Object> hashMap = new HashMap();
        hashMap.put("demo1",123);
        hashMap.put("demo1",1234);

        Object demo1 = hashMap.get("demo1");
        System.out.println(demo1);
    }

    @Test
    public void putValTest(){
        //反射目标类的class类对象
        Class<HashMap> hashMapClass = HashMap.class;
        //反射目标类的类对象
        HashMap<Integer, Object> stringHashMap = new HashMap();
        try {
            //暴力反射  参数1：反射的方法名   参数2：目标方法的参数类型
            Method hash = hashMapClass.getDeclaredMethod("putVal", int.class, Object.class, Object.class, boolean.class,
            boolean.class);
            try {
                //设置暴力执行
                hash.setAccessible(true);
                //执行方法  method.invoke(目标类对象,目标方法参数)
                Object demo1 = hash.invoke(stringHashMap,1, 1,456,false,true);
                System.out.println(stringHashMap);
                Object demo2 = hash.invoke(stringHashMap,17, 17,4567,false,true);
                System.out.println(stringHashMap);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
