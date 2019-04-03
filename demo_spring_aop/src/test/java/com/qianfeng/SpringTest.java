package com.qianfeng;

import com.qianfeng.aop.ISalePhoneLicense;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {

    @Autowired
    private ISalePhoneLicense proxy;

    @Test
    public void testCase1(){
        String phone = proxy.salePhone();
        proxy.saleComputer("2");
//        System.out.println(proxy);
//        System.out.println("用户买"+phone);
    }


}
