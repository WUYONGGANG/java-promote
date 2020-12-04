package com.wyg.java8.methodref;

import java.io.File;
import java.util.function.Function;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-04 16:36
 **/
public class TestClassInstanceMethodRef01 {
    public static void main(String[] args) {
        //1.传统方式
        Function<File,String> f1 = new Function<File, String>() {
            @Override
            public String apply(File file) {
                return file.getAbsolutePath();
            }
        };
        System.out.println(f1.apply(new File("pom.xml")));

        //lambda方式
        Function<File,String> f2 = file -> file.getAbsolutePath();
        System.out.println(f2.apply(new File("pom.xml")));
        //类实例方法引用
        Function<File,String> f3 = File::getAbsolutePath;
        System.out.println(f3.apply(new File("pom.xml")));
    }

}
