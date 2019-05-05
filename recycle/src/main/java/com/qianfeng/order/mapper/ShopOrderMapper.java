package com.qianfeng.order.mapper;

import com.qianfeng.order.vo.ShopOrderVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShopOrderMapper {
    List<ShopOrderVO> queryShopOrder(@Param("userId") int userId);
}
