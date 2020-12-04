package com.wyg.java8.interf;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-03 10:22
 **/
interface IA {
    default void doMethod01() {
        System.out.println("doMethod01");
    }
    default void doMethod02() {
        System.out.println("doMethod02");
    }
    void doMethod03();
    default void doMethod04(){
        System.out.println("doMethod04()");
    }
}

class ClassA implements IA {
    @Override
    public void doMethod01() {
        IA.super.doMethod01();
        System.out.println("ClassA.doMethod01");
    }

    @Override
    public void doMethod03() {
        System.out.println("doMethod03");
    }
}

public class TestInterfaceDefaultMethod01 {
    public static void main(String[] args) {
        IA a1 = new ClassA();
        a1.doMethod01();
        a1.doMethod03();
    }
}
