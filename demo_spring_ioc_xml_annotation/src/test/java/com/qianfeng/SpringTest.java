package com.qianfeng;

import com.qianfeng.ioc.Leader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //spring整合junit完成单元测试
@ContextConfiguration("classpath:spring.xml") // spring的核心配置类
public class SpringTest {

    @Autowired
    private Leader leader;

    @Test
    public void testCase1(){
        leader.drink();
    }
}
