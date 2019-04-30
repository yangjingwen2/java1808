package com.qianfeng.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RedisService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void zan(Integer userId,Integer videoId) throws Exception{
        //核心问题：如何存？？？
        //redis中key的设计(ershou-shouji(wurenji)-iphone-list-1)
        String key = "redis-zan-"+userId+"-"+videoId;
        redisTemplate.boundValueOps(key).set("1");
    }

    public Set<String> queryZan(Integer userId){
        Set<String> keys = redisTemplate.keys("redis-zan-"+userId+"-*");
        return keys;
    }
}
