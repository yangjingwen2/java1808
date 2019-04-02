package com.qianfeng.mapper;

import com.qianfeng.TbStudent;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {

    TbStudent queryStuById(@Param("stuId") Long id);
}
