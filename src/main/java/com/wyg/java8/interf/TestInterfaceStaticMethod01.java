package com.wyg.java8.interf;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-03 10:41
 * 静态方法不能被重写
 **/
interface IStatic {
    public static void doPrint() {
        System.out.println("IStatic.doPrint()");
    }
}
class ClassStatic implements  IStatic {
    public static void doPrint() {
        System.out.println("ClassD.doPrint()");
    }
}
public class TestInterfaceStaticMethod01 {
    public static void main(String[] args) {
        IStatic s1 = new ClassStatic();
        //s1.doPrint();  //error
        IStatic.doPrint(); //IStatic.doPrint()
        ClassStatic s2 = new ClassStatic();
        s2.doPrint(); //ClassD.doPrint()
        ClassStatic.doPrint(); //ClassD.doPrint()
    }
}
