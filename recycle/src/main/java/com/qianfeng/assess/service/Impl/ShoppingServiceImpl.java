package com.qianfeng.assess.service.Impl;

import com.qianfeng.assess.mapper.ShoppingMapper;
import com.qianfeng.assess.po.TbShopping;
import com.qianfeng.assess.service.IShoppingService;
import com.qianfeng.assess.vo.CarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements IShoppingService {
    @Autowired
    private ShoppingMapper shoppingMapper;
    @Override
    public void addShoppingCar(TbShopping shopping) {
        shoppingMapper.addShoppingCar(shopping);
    }

    @Override
    public List<CarVO> queryShoppingCar(int userId) {
        return shoppingMapper.queryShoppingCar(userId);
    }

    @Override
    public void deleteCar(int cartId) {
        shoppingMapper.deleteCar(cartId);
    }
}
