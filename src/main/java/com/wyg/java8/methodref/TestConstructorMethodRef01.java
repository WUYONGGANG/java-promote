package com.wyg.java8.methodref;

import java.util.Date;
import java.util.function.Supplier;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-04 15:33
 **/
public class TestConstructorMethodRef01 {
    public static void main(String[] args) {
        //Supplier对象的传统引用方式
        Supplier<Object> supplier = new Supplier<Object>() {
            @Override
            public Object get() {
                return new Object();
            }
        };
        System.out.println(supplier);
        //lambda表达式方式
        Supplier supplier1 = () -> new Object();
        System.out.println(supplier1.get());
        //构造方法引用
        Supplier<Object> supplier2 = Object::new;
        System.out.println(supplier2.get());

        Supplier supplier3 = Date::new;
        System.out.println(supplier3.get());

    }
}
