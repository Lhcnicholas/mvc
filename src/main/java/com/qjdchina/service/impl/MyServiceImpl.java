package com.qjdchina.service.impl;

import com.qjdchina.service.MyService;
import org.springframework.stereotype.Service;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/7/17
 **/
@Service
public class MyServiceImpl implements MyService {

    @Override
    public void aspectService() {
        System.out.println("--------在切面中运行-------");
    }
}
