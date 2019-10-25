package com.qjdchina.service.impl;

import com.qjdchina.service.Circle2Service;
import com.qjdchina.service.CircleService;
import com.qjdchina.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Circle2ServiceImpl implements Circle2Service {

	private static final Logger logger = LoggerFactory.getLogger(Circle2Service.class);

	@Autowired
	private MyService myService;

	@Override
	public void test() {
		logger.info("circle2 方法调用执行");
	}
}
