package com.qjdchina.controller;


import com.qjdchina.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dao")
public class MapperController {

	@Autowired
	private TestMapper testMapper;

	@RequestMapping(value = "/insert",produces = "application/json")
	public String insert(String name) {
		testMapper.insert(name);
		return "成功";
	}
}
