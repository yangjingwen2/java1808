package com.qianfeng.redis2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringRedisTEst {

    @Autowired
    private StringRedisTemplate redisTemplate;


    @Test
    public void testCase1(){
        Set<String> keys = redisTemplate.keys("*");
        System.out.println(keys);
    }


}
