package com.qjdchina.simple;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/6/5
 **/
public class StaticBlock {

    private static String hello;

    static {
        hello = "Hello,World!";
    }

    public static String getHello(){
        return hello;
    }
}
