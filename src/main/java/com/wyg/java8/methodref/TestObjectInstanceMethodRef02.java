package com.wyg.java8.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-04 16:51
 **/
public class TestObjectInstanceMethodRef02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100,200,300);
        System.out.println(list.size());
        //1.传统方式
        Supplier<Integer> s1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return list.size();
            }
        };
        System.out.println(s1.get());
        //2.lambda方式
        Supplier<Integer> s2 = () -> list.size();
        System.out.println(s2.get());
        //3.对象实例方法
        Supplier s3 = list::size;
        System.out.println(s3.get());


    }
}
