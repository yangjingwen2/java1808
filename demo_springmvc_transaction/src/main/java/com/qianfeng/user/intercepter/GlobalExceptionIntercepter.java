package com.qianfeng.user.intercepter;

import com.qianfeng.user.vo.JsonResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionIntercepter {

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public JsonResultVO nullExceptionHandler(Exception e){
        System.out.println(e.getMessage());
        JsonResultVO jsonResultVO = new JsonResultVO();
        jsonResultVO.setCode(2);
        jsonResultVO.setMsg("null.html");
        return jsonResultVO;
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseBody
    public JsonResultVO indexExceptionHandler(Exception e){
        System.out.println(e.getMessage());
        JsonResultVO jsonResultVO = new JsonResultVO();
        jsonResultVO.setCode(2);
        jsonResultVO.setMsg("null.html");
        return jsonResultVO;
    }
}
