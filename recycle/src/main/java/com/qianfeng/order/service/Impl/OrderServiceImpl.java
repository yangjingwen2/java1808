package com.qianfeng.order.service.Impl;

import com.qianfeng.order.mapper.OrderMapper;
import com.qianfeng.order.po.TbOrder;
import com.qianfeng.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public void addOrder(TbOrder order) {
        orderMapper.addOrder(order);
    }

    @Override
    public void deleteShop(int userId) {
        orderMapper.deleteShop(userId);
    }
}
