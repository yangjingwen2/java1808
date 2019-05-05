package com.qianfeng.Expressage.controller;

import com.qianfeng.Expressage.po.TbExpress;
import com.qianfeng.Expressage.service.IExpressService;
import com.qianfeng.order.po.TbOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@CrossOrigin //允许跨域。。前端解决跨域是jsonp
@RestController
@RequestMapping("/addExpress")
public class ExpressController {
    @Autowired
    private IExpressService expressServiceImpl;
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String addExpress(@RequestBody TbExpress express, HttpSession session){
        System.out.println("快递表："+express);
        String orderNum = (String) session.getAttribute("orderNum");
        express.setExpOrderNum(orderNum);
        expressServiceImpl.addExpress(express);
        return "succeed";
    }
}
