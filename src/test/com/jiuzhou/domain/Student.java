package com.jiuzhou.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 01210368 on 2017/5/10.
 */
public class Student implements Serializable {
    private String name;
    private Integer age;
    private List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
