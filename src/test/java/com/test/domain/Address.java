package com.test.domain;

import java.io.Serializable;

/**
 * Created by 01210368 on 2017/5/10.
 */
public class Address implements Serializable {
    private String province;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
