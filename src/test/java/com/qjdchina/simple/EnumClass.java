package com.qjdchina.simple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/6/25
 **/
public enum  EnumClass {

    lhc("lihongcheng",25),
    nqx("niuqingxia", 30);

    private String name;
    private Integer age;


    EnumClass(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static List<String> list() {
        List<String> list = new ArrayList<>();
        for (EnumClass enumClass : EnumClass.values()) {
            list.add(enumClass.getName());
        }
        return list;
    }
}
