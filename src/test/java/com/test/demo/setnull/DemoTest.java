package com.test.demo.setnull;

import com.test.domain.Student;
import org.junit.Test;

/**
 * Created by 01210368 on 2017/6/29.
 */
public class DemoTest {
    /**
     * set 可以null
     */
    @Test
    public void testSetNull(){
        Student student = new Student();
        student.setAddresses(null);
    }
}
