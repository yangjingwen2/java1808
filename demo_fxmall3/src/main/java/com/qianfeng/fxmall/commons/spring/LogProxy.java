package com.qianfeng.fxmall.commons.spring;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogProxy {

    Logger logger = Logger.getLogger(LogProxy.class);

    /**
     * joinPoint切点
     * @param joinPoint
     */
    @Around("execution(public * com.qianfeng.fxmall.goods.service.impl.SpringGoodsServiceImpl.queryGoodsById(..))")
    public void logging(ProceedingJoinPoint joinPoint){

        System.out.println("------------------------->>>>>>");
        try {
            String kind = joinPoint.getKind();
            //方法入参
            Object[] args = joinPoint.getArgs();

            //记录日志
            logger.debug(kind+":" + args);

            //执行被代理的方法，joinPoint.proceed类似method.invoke
            //返回值：就是方法的返回值
            Object proceed = joinPoint.proceed();

            logger.debug("返回值："+ proceed);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            //记录错误日志
            logger.warn(throwable.getMessage());
        }
    }
}
