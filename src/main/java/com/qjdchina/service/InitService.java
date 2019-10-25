package com.qjdchina.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class InitService implements InitializingBean {

	private static final Logger logger = LoggerFactory.getLogger(InitService.class);

	public InitService() {
		logger.info("InitSercie实例化");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("afterPropertiesSet()正在执行");
	}

	@PostConstruct
	public void postConstruct1() {
		logger.info("postConstruct1方法正在执行");
	}

	@PostConstruct
	public void postConstruct2() {
		logger.info("postConstruct2方法正在执行");
	}

	public void customInit() {
		logger.info("自定义初始化接口执行");

	}
}
