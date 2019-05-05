package com.qianfeng.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * 缓存数据访问层
 *
 */
@Repository
public class RedisHandler {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 通过key查询缓存中的字符串类型的数据
     * @param key
     * @return json格式的字符串
     */
    public String queryStringCacheByKey(String key){
        String result = redisTemplate.boundValueOps(key).get();
        return result;
    }

    /**
     * 保存String类型缓存
     * @param key
     * @param value json格式的字符串
     * @throws Exception
     */
    public void saveStringCache(String key,String value) throws Exception{
        redisTemplate.boundValueOps(key).set(value);
    }

    public String queryListCacheByKey(String key){
        return  null;
    }


}
