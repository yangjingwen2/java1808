package com.qianfeng.service;

import com.qianfeng.mapper.ImageMapper;
import com.qianfeng.po.TbImages;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ImageService {

    @Resource
    private ImageMapper imageMapper;

    public TbImages checkImageMD5(String md5) throws Exception{
        TbImages images = imageMapper.queryFileMD5(md5);
        return images;
    }

    public void saveImage(TbImages images) throws Exception{
        imageMapper.saveImage(images);
    }
}
