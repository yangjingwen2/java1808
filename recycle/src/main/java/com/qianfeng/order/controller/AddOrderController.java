package com.qianfeng.order.controller;


import com.qianfeng.order.po.TbOrder;
import com.qianfeng.order.service.IOrderService;
import com.qianfeng.order.vo.OrderVO;
import com.qianfeng.user.po.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Random;

@CrossOrigin //允许跨域。。前端解决跨域是jsonp
@RestController
@RequestMapping("/addOrder")
public class AddOrderController {
    @Autowired
    private IOrderService orderServiceImpl;
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String addOrder(@RequestBody TbOrder order,HttpSession session){
        System.out.println(order);
        TbUser user = (TbUser) session.getAttribute("user");
        long userId = user.getUserId();
        order.setUserId(userId);
        Date date=new Date();
        long time = date.getTime();
        Random random = new Random();
        String num=time+""+random.nextInt(10);
        session.setAttribute("orderNum",num);
        order.setOrderNum(num);
        orderServiceImpl.addOrder(order);
        orderServiceImpl.deleteShop((int) userId);
        System.out.println("接受到的值："+order);
        return "susseed";

    }
}
