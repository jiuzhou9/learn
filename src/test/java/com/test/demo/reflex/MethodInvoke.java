package com.test.demo.reflex;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by jiuzhou on 2017/8/13.
 * 反射机制：暴力反射hashMap中的hash()方法并执行
 */
public class MethodInvoke {

    /**
     * 暴力反射hashMap中的hash()方法，并进行执行该方法
     */
    @Test
    public void hashTest(){
        //反射目标类的class类对象
        Class<HashMap> hashMapClass = HashMap.class;
        //反射目标类的类对象
        HashMap<String, Object> stringHashMap = new HashMap();
        try {
            //暴力反射  参数1：反射的方法名   参数2：目标方法的参数类型
            Method hash = hashMapClass.getDeclaredMethod("hash", Object.class);
            try {
                //设置暴力执行
                hash.setAccessible(true);
                //执行方法  method.invoke(目标类对象,目标方法参数)
                Object demo1 = hash.invoke(stringHashMap, "demo1");
                Object demo2 = hash.invoke(stringHashMap, "demo2");
                System.out.println(demo1);
                System.out.println(demo2);
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
