package com.test.demo;

import com.test.domain.Student;
import org.junit.Test;

/**
 * Created by 01210368 on 2017/6/29.
 */
public class DemoTest {
    @Test
    public void testNull(){
        Student student = new Student();
        student.setAddresses(null);
    }
}
