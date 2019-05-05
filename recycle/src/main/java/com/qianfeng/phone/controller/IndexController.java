package com.qianfeng.phone.controller;

import com.qianfeng.phone.po.TbPhone;
import com.qianfeng.phone.service.IBrandService;
import com.qianfeng.phone.vo.BrandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/phone")
public class IndexController {
    @Autowired
    private IBrandService brandServiceImpl;
    @ResponseBody
    @RequestMapping("/brand")
    public List<BrandVO> queryBrand(){

        List<BrandVO> list = brandServiceImpl.queryBrand();
        return list;
    }

//    @ResponseBody
//    @RequestMapping("/callphone12")
//    public List<TbPhone> queryPhone(String brandId){
//        System.out.println("品牌id："+brandId);
//        if (brandId==null){
//            List<TbPhone> list=brandServiceImpl.queryPhone();
//            System.out.println(list);
//            return list;
//        }else{
//            int parentId = Integer.parseInt(brandId);
//            List<TbPhone> phones = brandServiceImpl.queryBrandPhone(parentId);
//            return phones;
//        }
//    }
}
