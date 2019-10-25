package com.qjdchina.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class HandlingController {

	private static final Logger logger = LoggerFactory.getLogger(HandlingController.class);

	@Autowired
	private ApplicationContext applicationContext;

	@RequestMapping("add")
	@ResponseBody
	public String add() {
		return "add";
	}

	@RequestMapping("beans")
	@ResponseBody
	public List<String> beans(){
		return CollectionUtils.arrayToList(applicationContext.getBeanDefinitionNames());
	}
}
