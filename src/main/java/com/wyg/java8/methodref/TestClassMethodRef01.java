package com.wyg.java8.methodref;

import java.util.function.Function;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-04 15:42
 **/
public class TestClassMethodRef01 {
    public static void main(String[] args) {
        //1.传统方式
        Function<String,Integer> f1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
        System.out.println(f1.apply("100"));


        //2.lambda表达式
        Function<String,Integer> f2 = s -> Integer.parseInt(s);
        System.out.println(f2.apply("200"));

        //类方法(静态方法)引用
        Function<String,Integer> f3 = Integer::parseInt;
        System.out.println(f3.apply("300"));

    }
}
