package com.wyg.java8.interf;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-03 10:48
 * @FunctionalInterface 描述的接口是函数式接口，此接口内部只允许有一个抽象方法
 **/
@FunctionalInterface
interface Fun {
    //函数式接口只允许有一个方法是抽象的
    void doMethod01();

    default void doMethod02() {

    }
}

public class TestFunctionInterface01 {
    public static void main(String[] args) {
        new Fun() {
            @Override
            public void doMethod01() {
                System.out.println("doMethod01()");
            }
        }.doMethod01();
    }
}
