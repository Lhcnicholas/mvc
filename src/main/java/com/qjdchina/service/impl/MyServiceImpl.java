package com.qjdchina.service.impl;

import com.qjdchina.service.MyService;
import com.qjdchina.utils.annotations.RoleAdmin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/7/17
 **/
@Service
public class MyServiceImpl implements MyService {

    private static final Logger logger = LogManager.getLogger(MyServiceImpl.class);

    @Override
    @RoleAdmin
    public void aspectService() {
        logger.info("--------在切面中运行-------");
    }

    @Override
    public void noAspectService() {
        logger.info("不在切面中运行");
    }
}
