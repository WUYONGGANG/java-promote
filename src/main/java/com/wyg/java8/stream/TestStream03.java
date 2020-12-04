package com.wyg.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-04 18:12
 **/
public class TestStream03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,21,30,31,30);

        list.stream()//创建流
                .filter(t -> t%2 ==0) //中间操作
                .forEach(System.out::println);//终止操作
        System.out.println("=========================");
        list.stream()//创建流
                .filter(t -> t%2 ==0)//中间操作
                .skip(1) //跳过一个
                .limit(3) //取3个
                .distinct()//去重
                .forEach(System.out::println);//终止操作







    }
}
