package com.qjdchina.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Des:
 * Author:LiNic
 * Date:2018/7/20
 */
@Component
@Aspect
public class RequestInterceptor {

    /* logger */
    private static Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);

    @Pointcut(value = "@annotation(com.qjdchina.utils.annotations.RoleAdmin)")
    public void adminRequired() {

    }

    @Before("adminRequired()")
    public void adminCommon(JoinPoint joinPoint) {
        logger.debug("------HI,这里是前置切面");
    }
}
