package com.qianfeng.mapper;


import com.qianfeng.po.TbImages;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImageMapper {

     TbImages queryFileMD5(@Param("imageMd5") String md5);

     void saveImage(TbImages images);



}
