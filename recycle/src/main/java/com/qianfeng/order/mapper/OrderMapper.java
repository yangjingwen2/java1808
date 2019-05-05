package com.qianfeng.order.mapper;

import com.qianfeng.order.po.TbOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrderMapper {
    void addOrder(@Param("order") TbOrder order);
    void deleteShop(@Param("userId")int userId);
}
