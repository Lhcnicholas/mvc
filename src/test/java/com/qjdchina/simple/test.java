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
        System.out.println(StaticBlock.getHello());
        weiTest(10,1);
    }

    public static void dateTest(){
        Date date = new Date(0);
        System.out.println(date);
    }

    public static void weiTest(int num,int i){
        int j = num & (1 << i);
        System.out.println(i);
    }
}
