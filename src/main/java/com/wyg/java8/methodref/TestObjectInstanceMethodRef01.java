package com.wyg.java8.methodref;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-04 15:18
 **/
public class TestObjectInstanceMethodRef01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C");
        //传统方式
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //lambda方式
        list.forEach(t -> System.out.println(t));

        //方法引用
        PrintStream ps = System.out;
        list.forEach(ps::println);
        list.forEach(System.out::println);

    }
}
