package com.wyg.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-03 11:33
 **/
public class TestLambda01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C","D");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        list.forEach(new Consumer<String>() {//匿名内部类
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("++++++++++lambda+++++++++++++++++++++++");
        list.forEach((s) -> System.out.println(s));
        list.forEach(s -> System.out.println(s));
        list.forEach(s -> {System.out.println(s);});

    }
}
