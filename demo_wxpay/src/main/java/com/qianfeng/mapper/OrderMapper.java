package com.qianfeng.mapper;


import com.qianfeng.po.TbOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {

    void save(TbOrder order);

    void updateOrderStatus(@Param("orderNo") String orderNo);
}
