package com.qjdchina.simple;

import com.sun.org.apache.xerces.internal.util.MessageFormatter;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/6/26
 **/
public class EnumClassTest {

    @Test
    public void list() {
        List<String> list = new ArrayList<>();
        list.add("lhc");
        list.add("nqx");
        System.out.println(MessageFormat.format("接收人{0}", list));

    }

    @Test
    public void testCry() {
        /*long startTime = System.currentTimeMillis();
        System.out.println(increase(10000));
        System.out.println("------直接执行耗时：" + (System.currentTimeMillis() - startTime));*/

        try {
            long astartTime = System.currentTimeMillis();
            System.out.println(increase(10000));
            System.out.println("------用try包裹执行：" + (System.currentTimeMillis() - astartTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int increase(int n) {
        if (n > 1) {
            return (int) (increase(n - 1) + n + Math.random());
        } else {
            return n;
        }
    }
}