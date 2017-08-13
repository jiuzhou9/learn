package com.test.demo.reflex;

import com.test.domain.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by jiuzhou on 2017/8/4.
 * 反射机制：获取class类对象
 */
public class GetClass {

    /*----------------获取目标类的class对象start-----------------------*/
    /**
     * 第一种方式：类实例对象.getClass()
     */
    @Test
    public void test01(){
        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        System.out.println("aClass="+aClass);
    }

    /**
     * 第二种方式：类.class
     */
    @Test
    public void test02(){
        Class<Student> studentClass = Student.class;
        System.out.println("studentClass="+studentClass);
    }

    /**
     * 第三种方式：Class.forName("类全名")
     */
    @Test
    public void test03(){
        try {
            Class student = Class.forName("com.test.domain.Student");
            System.out.println("student="+student);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*----------------获取目标类的class对象end-----------------------*/

}
