package com.qianfeng.Expressage.mapper;

import com.qianfeng.Expressage.po.TbExpress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExpressMapper {
    void addExpress(@Param("express") TbExpress express);
}
