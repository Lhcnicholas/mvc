package com.qjdchina.controller;


import com.qjdchina.utils.BusinessException;
import com.qjdchina.utils.RestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhc
 */
@RestController
@RequestMapping("/error")
public class TestErrorController {

	private static final Logger logger = LoggerFactory.getLogger(TestErrorController.class);


	@RequestMapping("/direct")
	public RestBody directReturn() {
		logger.info("直接返回错误");
		return new RestBody("1", "直接返回错误");
	}

	@RequestMapping("/throw")
	public RestBody throwException() {
		logger.error("抛出异常错误信息");
		throw new BusinessException("1", "抛出异常错误信息");
	}
}
