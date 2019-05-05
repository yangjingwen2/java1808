package com.qianfeng.phone.controller;

import com.qianfeng.phone.po.TbPhone;
import com.qianfeng.phone.service.IBrandService;
import com.qianfeng.phone.vo.BrandIdVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@CrossOrigin //允许跨域。。前端解决跨域是jsonp
@RestController
@RequestMapping("/callphone")
public class BrandController {
    @Autowired
    private IBrandService brandServiceImpl;

    @RequestMapping("/{brandId}/{seek}")
    public List<TbPhone> queryPhone(@PathVariable("brandId") String brandId,@PathVariable("seek") String seek,HttpServletRequest request) {
        System.out.println("品牌id：" + brandId);
        String requestURL = request.getRequestURL().toString();
//        String url = "/recycle/callphone/"+brandId;


        if (seek == null||"null".equals(seek)||"".equals(seek)||"0".equals(seek)) {
            System.out.println("执行遍历2");
            if (brandId == null || "0".equals(brandId)) {
                List<TbPhone> list = brandServiceImpl.queryPhone(requestURL);
                System.out.println(list);
                return list;
            } else {
                int parentId = Integer.parseInt(brandId);
                List<TbPhone> phones = brandServiceImpl.queryBrandPhone(requestURL,parentId);
                return phones;
            }
        }else {
            System.out.println("执行查1");
            List<TbPhone> list = brandServiceImpl.queryPhoneByPhoneName(requestURL,seek,seek);
            System.out.println("搜索到的："+list);
            return  list;
        }
    }
}
