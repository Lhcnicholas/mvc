package com.qjdchina.service.impl;

import com.qjdchina.service.CircleService;
import com.qjdchina.service.MyService;
import com.qjdchina.utils.annotations.RoleAdmin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/7/17
 **/
@Service
public class MyServiceImpl implements MyService, InitializingBean {

    private static final Logger logger = LogManager.getLogger(MyServiceImpl.class);

    @Value("${name}")
    private String name;

    @Autowired
    private CircleService circleService;

    @Override
    public void hello() {
        logger.info("你好,名字:{}", name);
        circleService.test();
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("@PostConstruct 方法开始执行");
    }

    @Override
    @RoleAdmin
    public void aspectService() {
        logger.info("--------在切面中运行-------");
    }

    @Override
    public void noAspectService() {
        logger.info("不在切面中运行");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("afterProperties方法开始执行");
    }
}
