package com.qianfeng.order.controller;

import com.qianfeng.order.service.IShopOrderService;
import com.qianfeng.order.vo.ShopOrderVO;
import com.qianfeng.user.po.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@CrossOrigin //允许跨域。。前端解决跨域是jsonp
@RestController
@RequestMapping("/shopOrder")
public class ShopOrderController {
    @Autowired
    private IShopOrderService shopOrderServiceImpl;
    @RequestMapping(method = RequestMethod.GET)
    public List<ShopOrderVO> queryShopOrder(HttpSession session){
        TbUser user = (TbUser) session.getAttribute("user");
        System.out.println("取到的对象："+user);
        if (user==null){
            return null;
        }
        long userId = user.getUserId();

        List<ShopOrderVO> shopOrderVOS = shopOrderServiceImpl.queryShopOrder((int) userId);
        for (ShopOrderVO shopOrderVO:shopOrderVOS){
            String shoppingType = shopOrderVO.getShoppingType();
            String[] str=shoppingType.split("\\,");
            shopOrderVO.setShoppingTypeList(Arrays.asList(str));
        }
        System.out.println("购物车："+shopOrderVOS);
        return shopOrderVOS;
    }
}
