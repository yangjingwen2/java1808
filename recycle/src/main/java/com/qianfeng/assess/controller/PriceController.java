package com.qianfeng.assess.controller;

import com.qianfeng.assess.vo.WreckPriceVO;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin //允许跨域。。前端解决跨域是jsonp
@RestController
@RequestMapping("/imputedPrice")
public class PriceController {
    @RequestMapping(method = RequestMethod.GET)
    public String imputed(HttpServletRequest request){
        Integer wreck = (Integer) request.getSession().getAttribute("wreck");
        Integer original = (Integer) request.getSession().getAttribute("original");
        Logger logger = Logger.getLogger(PriceController.class);
        logger.info("wreck---"+wreck+"----original--"+original);
        WreckPriceVO wreckPriceVO=new WreckPriceVO();
        int discount=original*(100-wreck)/100;
        if (discount<50){
            wreckPriceVO.setWreckPrice("50");
            return "50";
        }
        wreckPriceVO.setWreckPrice(discount+"");
        request.getSession().setAttribute("wreckHPP",discount);
        return discount+"";
    }
}
