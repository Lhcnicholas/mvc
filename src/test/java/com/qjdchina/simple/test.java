package com.qjdchina.simple;

import java.util.Date;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/5/14
 **/
public class test {
    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();
        childClass.dd();
        dateTest();
    }

    public static void dateTest(){
        Date date = new Date(0);
        System.out.println(date);
    }
}
