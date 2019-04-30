package com.qianfeng.controller;

import com.qianfeng.cache.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/douyin")
public class ZanController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/{userId}/{videoId}")
    public String zan(@PathVariable("userId") Integer userId, @PathVariable("videoId") Integer videoId) throws Exception {
        System.out.println(userId + "/" + videoId);

        //Redis存储的问题
        redisService.zan(userId,videoId);
        //点赞完成之后是否需要返回消息？
        return "1";
    }

    @RequestMapping("/query/{userId}")
    public Object queryZan(@PathVariable("userId") Integer userId){
        Set<String> stringSet = redisService.queryZan(userId);
        return stringSet;
    }
}
