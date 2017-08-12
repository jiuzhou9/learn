package com.test.demo.reflex;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by jiuzhou on 2017/8/13.
 * 反射机制：获取构造器
 */
public class GetConstructors {
    /*----------------获取构造器 start-------------------------------*/
    /**
     * 获取所有public修饰的构造器
     * getConstructors()
     * 普通反射
     */
    @Test
    public void test01(){
        try {
            Class<?> aClass = Class.forName("com.test.domain.Student");
            Constructor<?>[] constructors = aClass.getConstructors();
            for (Constructor constructor : constructors){
                System.out.println(constructor);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取所有构造器，也称为暴力获取
     * getDeclaredConstructors()
     */
    @Test
    public void test02(){
        try {
            Class<?> aClass = Class.forName("com.test.domain.Student");
            Constructor<?>[] constructors = aClass.getDeclaredConstructors();
            for (Constructor constructor : constructors){
                System.out.println(constructor);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取无参构造器
     * 这个构造器一定是public修饰的
     * getConstructor()
     * 普通反射
     */
    @Test
    public void test03(){
        try {
            Class<?> aClass = Class.forName("com.test.domain.Student");
            Constructor<?> constructor = aClass.getConstructor();
            System.out.println(constructor);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    /*----------------获取构造器 end-------------------------------*/
}
