package com.qianfeng.assess.controller;

import com.qianfeng.assess.service.IShoppingService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/delete")
public class DeleteGoodController {
    @Autowired
    private IShoppingService shoppingServiceImpl;
    @ResponseBody
    @RequestMapping("/deleteCar")
    public String deleteCar(String cartId){
        Logger logger = Logger.getLogger(DeleteGoodController.class);
        logger.info("传入的删除商品id"+cartId);
        int carId=0;
        if (cartId!=null){
            carId=Integer.parseInt(cartId);
        }
        shoppingServiceImpl.deleteCar(carId);
        return "success";
    }
}
