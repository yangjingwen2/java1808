package com.qianfeng.assess.controller;

import com.qianfeng.assess.vo.ImputedVO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.logging.Logger;

@CrossOrigin //允许跨域。。前端解决跨域是jsonp
@RestController
@RequestMapping("/imputed")
public class ImputedController {
    @RequestMapping(method = RequestMethod.POST)
    public String imputed(@RequestBody ImputedVO imputedVO, HttpSession session){
        List<String> imputedList = imputedVO.getImputedList();
        String phonePrice = imputedVO.getPhonePrice();
        System.out.println("++--++"+phonePrice);
        int pri=0;
        if (phonePrice!=null){
            pri=Integer.parseInt(phonePrice);
        }
        int i=0;
        int j=0;
        System.out.println("++++++"+imputedList);
        for (String imput:imputedList){
            if (imput!=null){
                i=Integer.parseInt(imput);
            }
            j=j+i;
        }
        session.setAttribute("wreck",j);
        session.setAttribute("original",pri);
        session.setAttribute("imputedVO",imputedVO);
        System.out.println("------"+j);

        return j+"";
    }
}
