package com.qianfeng.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class RedisTest {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void testCase1(){
        redisTemplate.boundValueOps("qianfeng").set("java2");
    }

    /**
     * 查询字符串缓存
     */
    @Test
    public void testCase2(){
        String qianfeng = redisTemplate.boundValueOps("qianfeng").get();
        System.out.println(qianfeng);
    }

    /**
     * 存Hash类型
     */
    @Test
    public void testCase3(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name","java");
        hashMap.put("age","24");
        redisTemplate.boundHashOps("qianfeng_hash").putAll(hashMap);
    }

    /**
     * 获取hash类型
     */
    @Test
    public void testCase4(){
        Map<Object, Object> qianfengHash = redisTemplate.boundHashOps("qianfeng_hash").entries();
        Object name = qianfengHash.get("name");
        System.out.println(name);
    }

    /**
     * list集合
     */
    @Test
    public void testCase5(){
        Long aLong = redisTemplate.boundListOps("books").leftPushAll("zhangsan", "lisi");
        System.out.println(aLong);
    }

    /**
     * 获取List
     */
    @Test
    public void testCase6(){
        List<String> list = redisTemplate.boundListOps("books").range(0, -1);
        System.out.println(list);
    }

    /**
     * 获取所有Key对应的数据
     */
    @Test
    public void testCase7(){
        Set<String> keys = redisTemplate.keys("redis-zan-10001-*");
        System.out.println(keys);
    }

}
