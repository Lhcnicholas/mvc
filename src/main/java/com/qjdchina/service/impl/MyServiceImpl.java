package com.qjdchina.service.impl;

import com.qjdchina.service.MyService;
import com.qjdchina.utils.annotations.RoleAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/7/17
 **/
@Service
public class MyServiceImpl implements MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyServiceImpl.class);

    @Override
    @RoleAdmin
    public void aspectService() {
        System.out.println("--------在切面中运行-------");
    }

    @Override
    public void noAspectService() {
        logger.info("不在切面中运行");
    }
}
