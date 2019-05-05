package com.qianfeng.user.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SystemExceptionProxy {

    @ExceptionHandler(AuthorizationException.class)
    public String authException(){
        return "redirect:../auth.html";
    }
}
