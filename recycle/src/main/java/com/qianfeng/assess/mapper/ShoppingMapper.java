package com.qianfeng.assess.mapper;

import com.qianfeng.assess.po.TbShopping;
import com.qianfeng.assess.vo.CarVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShoppingMapper {
    void addShoppingCar (@Param("shopping")TbShopping shopping);
    List<CarVO> queryShoppingCar(@Param("userId") Integer userId);
    void deleteCar(@Param("cartId") Integer cartId);
}
