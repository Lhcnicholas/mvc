package com.qjdchina.controller;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/5/14
 **/
@Controller
@Validated
public class IndexController {

    @Value("#{app['name']}")
    private String name;

    @Value("#{app['list']}")
    private List<String> stringList;

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello" + name;
    }

    @RequestMapping(value = "cookie",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCookie(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            response.getWriter().println(cookie.getValue());
        }
        return null;
    }

    @RequestMapping(value = "cookie",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public String setCookie(HttpServletRequest request,HttpServletResponse response) {
        Cookie cookie = new Cookie("name","lihongcheng");
        cookie.setDomain("baidu.com");
        response.addCookie(cookie);
        return cookie.getValue();
    }

    @RequestMapping(value = "type")
    @ResponseBody
    public String testType(ArrayList<String> stringList) {
        for (String s : stringList) {
            System.out.println(s);
        }
        return null;
    }

    @RequestMapping(value = "valid")
    @ResponseBody
    public String testValid(@NotBlank String validString) {
        return validString;
    }

    @RequestMapping(value = "list")
    @ResponseBody
    public List<String> getStringList(){
        return stringList;
    }

}