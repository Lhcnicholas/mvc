package com.qjdchina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/5/14
 **/
@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello,World";
    }

}