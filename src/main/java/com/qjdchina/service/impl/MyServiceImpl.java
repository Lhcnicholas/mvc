package com.qjdchina.service.impl;

import com.qjdchina.service.MyService;
import com.qjdchina.utils.annotations.RoleAdmin;
import org.springframework.stereotype.Service;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/7/17
 **/
@Service
public class MyServiceImpl implements MyService {

    @Override
    @RoleAdmin
    public void aspectService() {
        System.out.println("--------在切面中运行-------");
    }
}
