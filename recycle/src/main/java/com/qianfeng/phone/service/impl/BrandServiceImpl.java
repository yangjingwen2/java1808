package com.qianfeng.phone.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.qianfeng.cache.RedisHandler;
import com.qianfeng.phone.mapper.BrandMapper;
import com.qianfeng.phone.po.TbPhone;
import com.qianfeng.phone.service.IBrandService;
import com.qianfeng.phone.vo.BrandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
@Service
public class BrandServiceImpl implements IBrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private RedisHandler redisHandler;
    @Override
    public List<BrandVO> queryBrand() {
        return brandMapper.queryBrand();
    }

    @Override
    public List<TbPhone> queryPhone(String key) {
        List<TbPhone> list =null;
        try {
            //1、查询缓存
            String cacheResult = redisHandler.queryStringCacheByKey(key);
            //将json字符串转换成Java对象
            Type type = new TypeToken<List<TbPhone>>() {
            }.getType();
            Gson gson = new Gson();
            list = gson.fromJson(cacheResult, type);

            //2、缓存中是否有数据
            if (null == list || list.isEmpty()) {
                //2.1如果没有数据,访问数据库（访问dao层查询数据）
                list = brandMapper.queryPhone();
                //5、将数据库的数据写入缓存
                String json = gson.toJson(list, type);
                redisHandler.saveStringCache(key,json);

            }
            //2.2、缓存中有数据



        } catch (Exception e) {
            e.printStackTrace();
        }

        // 2、6步骤
        return list;
    }

    @Override
    public List<TbPhone> queryBrandPhone(String key,int brandId) {
        List<TbPhone> list =null;
        try {
            //1、查询缓存
            String cacheResult = redisHandler.queryStringCacheByKey(key);
            //将json字符串转换成Java对象
            Type type = new TypeToken<List<TbPhone>>() {
            }.getType();
            Gson gson = new Gson();
            list = gson.fromJson(cacheResult, type);

            //2、缓存中是否有数据
            if (null == list || list.isEmpty()) {
                //2.1如果没有数据,访问数据库（访问dao层查询数据）
                list = brandMapper.queryBrandPhone(brandId);
                //5、将数据库的数据写入缓存
                String json = gson.toJson(list, type);
                redisHandler.saveStringCache(key,json);

            }
            //2.2、缓存中有数据



        } catch (Exception e) {
            e.printStackTrace();
        }

        // 2、6步骤
        return list;
    }

    @Override
    public List<TbPhone> queryPhoneByPhoneName(String key,String seek,String seek1) {
        List<TbPhone> list =null;
        try {
            //1、查询缓存
            String cacheResult = redisHandler.queryStringCacheByKey(key);
            //将json字符串转换成Java对象
            Type type = new TypeToken<List<TbPhone>>() {
            }.getType();
            Gson gson = new Gson();
            list = gson.fromJson(cacheResult, type);

            //2、缓存中是否有数据
            if (null == list || list.isEmpty()) {
                //2.1如果没有数据,访问数据库（访问dao层查询数据）
                list = brandMapper.queryPhoneByPhoneName(seek,seek1);
                //5、将数据库的数据写入缓存
                String json = gson.toJson(list, type);
                redisHandler.saveStringCache(key,json);

            }
            //2.2、缓存中有数据

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 2、6步骤
        return list;
    }
}
