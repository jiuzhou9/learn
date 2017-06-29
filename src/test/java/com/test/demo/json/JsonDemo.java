package com.test.demo.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.domain.Address;
import com.test.domain.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 01210368 on 2017/5/10.
 */
public class JsonDemo {

    /**
     * Json解析
     */
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
        //1.将json字符串转换成jsonObject
        JSONObject jsonObjectStudent = JSONObject.parseObject(string);
        //2.jsonObject获取age键的值，通过强转自己确定返回值类型
        Integer age = (Integer) jsonObjectStudent.get("age");
        //3.jsonObject获取addresses的值，通过强转自己确定返回值类型
        List<String> addressesList = (List<String>) jsonObjectStudent.get("addresses");
        System.out.println(addressesList);
    }
}
