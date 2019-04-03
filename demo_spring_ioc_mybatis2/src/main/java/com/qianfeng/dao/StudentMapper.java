package com.qianfeng.dao;

import com.qianfeng.info.TbStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {

    TbStudent queryStudentById(@Param("stuId") Long stuId);
}
