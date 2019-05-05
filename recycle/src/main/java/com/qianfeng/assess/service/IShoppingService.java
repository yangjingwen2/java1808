package com.qianfeng.assess.service;

import com.qianfeng.assess.po.TbShopping;
import com.qianfeng.assess.vo.CarVO;

import java.util.List;


public interface IShoppingService {
    void addShoppingCar (TbShopping shopping);
    List <CarVO> queryShoppingCar(int userId);
    void deleteCar(int cartId);
}
