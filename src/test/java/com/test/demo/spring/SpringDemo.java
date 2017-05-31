package com.test.demo.spring;

import com.demo.model.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 01210368 on 2017/5/31.
 */
public class SpringDemo {

    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:application/applicationContext.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application/applicationContext.xml");
        SpringBean springBean = (SpringBean) applicationContext.getBean("springBean");
        springBean.printName();
    }
}
