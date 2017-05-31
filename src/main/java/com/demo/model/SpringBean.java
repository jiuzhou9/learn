package com.demo.model;

/**
 * Created by 01210368 on 2017/5/31.
 * spring的Bean
 */
public class SpringBean {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }
}
