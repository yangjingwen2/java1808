package com.qianfeng.assess.controller;

import com.qianfeng.assess.vo.CarVO;
import com.qianfeng.user.po.TbUser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@CrossOrigin //允许跨域。。前端解决跨域是jsonp
@RestController
@RequestMapping("/isLogin")
public class isLoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String showCar(HttpSession session){
        TbUser user = (TbUser) session.getAttribute("user");
        if (user!=null){
            return "yes";
        }else {
            return "no";
        }
    }
}
