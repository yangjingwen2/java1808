package com.qianfeng.mapper;


import com.qianfeng.po.TbOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    void save(TbOrder order);
}
