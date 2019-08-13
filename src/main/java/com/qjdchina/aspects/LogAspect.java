package com.qjdchina.aspects;

import com.qjdchina.utils.BusinessException;
import com.qjdchina.utils.RestBody;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class LogAspect {

	private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

	@Autowired
	private HttpServletRequest request;

	@Pointcut("execution(com.qjdchina.utils.RestBody com.qjdchina.controller..*.*(..))")
	public void pointCut() {

	}

	@AfterReturning(pointcut = "pointCut()", returning = "restBody")
	public void afterReturning(JoinPoint joinPoint, RestBody restBody) {
		if (!"0".equals(restBody.getCode())) {
			logger.info("请求地址:{},{}接口返回错误,错误消息:{}",request.getRequestURL(), joinPoint.getSignature().getName(), restBody.getMessage());
		}
	}

	@AfterThrowing(pointcut = "pointCut()", throwing = "ex")
	public void afterThrowing(JoinPoint joinPoint, BusinessException ex) {
		logger.info("请求地址:{},{}接口返回错误,错误消息:{}", request.getRequestURL(), joinPoint.getSignature().getName(), ex.getMessage());
	}
}
