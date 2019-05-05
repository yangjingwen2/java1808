package com.qianfeng.assess.controller;

import com.qianfeng.assess.service.ITypeService;
import com.qianfeng.assess.vo.PagePhoneVO;
import com.qianfeng.assess.vo.PtypeVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin //允许跨域。。前端解决跨域是jsonp
@RestController
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private ITypeService typeServiceImpl;
    @RequestMapping(method = RequestMethod.POST)
    public List<PtypeVO> queryPtype(@RequestBody PagePhoneVO pagePhoneVO){

        int id=1;
        if (pagePhoneVO.getPage()!=null){
         id=Integer.parseInt(pagePhoneVO.getPage());
        }
        int id2=10;
        if (pagePhoneVO.getPhone()!=null){
            id2=Integer.parseInt(pagePhoneVO.getPhone());
        }
        List<PtypeVO> list=typeServiceImpl.queryPtype(id,id2);
        Logger logger = Logger.getLogger(TypeController.class);
        logger.info("返回："+list);
        logger.info("返回参数："+pagePhoneVO.getPage()+"-----"+pagePhoneVO.getPhone());
        return list;
    }
}
