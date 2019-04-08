package com.qianfeng.spring2;

import com.qianfeng.spring.IStudent;
import com.qianfeng.spring.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {

    /**
     * 如果Student没有实现接口，则采用的CGLib实现的AOP功能
     * 如果Student实现了接口，则采用JDK的动态代理实现AOP功能
     */
    @Autowired
    private IStudent student;

    @Test
    public void testCase1(){
        student.study();
    }
}
