package com.wyg.java8.methodref;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-04 16:44
 **/
public class TestClassInstanceMethodRef02 {
    public static void main(String[] args) {
        //对数组内容进行排序
        String[] strArray = {"a","abc","abcd"};
        //传统方式
        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(Arrays.toString(strArray));

        //lambda排序
        Arrays.sort(strArray, (o1,o2) -> o1.compareToIgnoreCase(o2));

        //类方法引用
        Arrays.sort(strArray, String::compareToIgnoreCase);
    }
}
