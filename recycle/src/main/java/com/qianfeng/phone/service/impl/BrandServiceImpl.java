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
        //将json字符串转换成Java对象
        Type type = new TypeToken<List<TbPhone>>() {
        }.getType();
        Gson gson = new Gson();
        try {



            if (redisHandler.checkKeys(key)){
                //1、查询缓存
                String cacheResult = redisHandler.queryStringCacheByKey(key);
                list = gson.fromJson(cacheResult, type);
                return list;
            } else {


            //双重检测锁机制
            // 好处：1、有锁，可以保证线程的串行执行，避免穿透。2、效率高，不太影响性能。
//            if (null == list || list.isEmpty()) {
                //所有现在在此处排队
                synchronized (this) {
                    //再次进行缓存查询
                    //1、查询缓存
                    String cacheResult = redisHandler.queryStringCacheByKey(key);
                    //将json字符串转换成Java对象
                    list = gson.fromJson(cacheResult, type);
                    //2、缓存中是否有数据
                    if (null == list || list.isEmpty()) {
                        System.out.println("------------->访问数据库");
                        //2.1如果没有数据,访问数据库（访问dao层查询数据）
                        list = brandMapper.queryPhone();
                        String json = gson.toJson(list, type);
                        if (null == list || list.isEmpty()) {
                            //如果查询到的数据为空，避免恶意无效key穿透，需要保存无效key。
                            //但是避免无效key撑满整个redis内存，所以需要给无效key设置过期时间
                            redisHandler.saveStringCacheExpire(key,json);
                        } else {
                            //5、将数据库的数据写入缓存

                            //不论数据库中是否有此数据，都保存一份到redis缓存中，避免恶意缓存穿透攻击。
                            redisHandler.saveStringCache(key, json);
                        }



                    }
                }
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
        //将json字符串转换成Java对象
        Type type = new TypeToken<List<TbPhone>>() {
        }.getType();
        Gson gson = new Gson();
        try {
            if (redisHandler.checkKeys(key)) {
                //1、查询缓存
                String cacheResult = redisHandler.queryStringCacheByKey(key);
                list = gson.fromJson(cacheResult, type);
                return list;
            } else {

//            //2、缓存中是否有数据
//            if (null == list || list.isEmpty()) {
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
