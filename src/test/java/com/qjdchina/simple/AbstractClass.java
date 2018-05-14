package com.qjdchina.simple;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/5/14
 **/
public abstract class AbstractClass {

    public void sout(){
        System.out.println("father");
    }

    public void dd(){
        this.sout();
    }
}
