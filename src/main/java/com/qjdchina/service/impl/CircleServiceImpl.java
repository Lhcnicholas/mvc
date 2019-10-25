package com.qjdchina.service.impl;

import com.qjdchina.service.Circle2Service;
import com.qjdchina.service.CircleService;
import com.qjdchina.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircleServiceImpl implements CircleService {

	private static final Logger logger = LoggerFactory.getLogger(CircleServiceImpl.class);

	@Autowired
	private Circle2Service circle2Service;

	@Override
	public void test() {
		logger.info("circle 方法调用执行");
		circle2Service.test();
	}
}
