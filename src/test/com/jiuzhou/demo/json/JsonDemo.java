package com.jiuzhou.demo.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jiuzhou.domain.Address;
import com.jiuzhou.domain.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 01210368 on 2017/5/10.
 */
public class JsonDemo {

    @Test
    public void test01(){
        //实例化student对象
        Student student = new Student();
        student.setAge(11);
        student.setName("xx");
        List<Address> addresses = new ArrayList<Address>();
        Address address = new Address();
        address.setProvince("吉林");
        address.setCity("长春");
        Address address1 = new Address();
        address1.setProvince("吉林");
        address1.setCity("四平");
        addresses.add(address);
        addresses.add(address1);
        student.setAddresses(addresses);

        //student对象Json化
        String string = JSON.toJSONString(student);
        System.out.println(string);

        //解析json字符串
        JSONObject jsonObjectStudent = JSONObject.parseObject(string);
        Integer age = (Integer) jsonObjectStudent.get("age");
        List<String> addressesList = (List<String>) jsonObjectStudent.get("addresses");
        System.out.println(addressesList);
    }
}
