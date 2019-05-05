package com.qianfeng.assess.controller;

import com.qianfeng.assess.po.TbShopping;
import com.qianfeng.assess.service.IShoppingService;
import com.qianfeng.assess.vo.ImputedVO;
import com.qianfeng.user.po.TbUser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@CrossOrigin //允许跨域。。前端解决跨域是jsonp
@RestController
@RequestMapping("/shopping")
public class shoppingController {
    @Autowired
    private IShoppingService shoppingService;
    @RequestMapping(method = RequestMethod.POST)
    public String imputed(HttpSession session) {
        Logger logger = Logger.getLogger(shoppingController.class);
        //logger.info("传入价格："+wreckHp);
        ImputedVO imputedVO = (ImputedVO) session.getAttribute("imputedVO");
        TbShopping tbShopping = new TbShopping();
        int phoneId = 0;
        if (imputedVO.getPhoneId() != null) {
            phoneId = Integer.parseInt(imputedVO.getPhoneId());
        }
        tbShopping.setShopPhoneId(phoneId);
        //Integer wreck = (Integer) session.getAttribute("wreck");
        Integer wreckHPP = (Integer) session.getAttribute("wreckHPP");
//        Integer wreck=0;
//        if (wreckHp!=null){
//            wreck=Integer.parseInt(wreckHp);
//        }
        tbShopping.setShopWreckPrice(wreckHPP);
        tbShopping.setShopPhonePic(imputedVO.getPhonePrice());
        //遍历得到所有的折损类型
        StringBuilder type = new StringBuilder();
        List<String> typeList = imputedVO.getType();
        for (String t : typeList) {
            type = type.append(t+",");
        }
        tbShopping.setShopWreckType(type.toString());
        TbUser user = (TbUser) session.getAttribute("user");
        tbShopping.setShopUserId(user.getUserId());
        shoppingService.addShoppingCar(tbShopping);
        return "success";
    }
}
