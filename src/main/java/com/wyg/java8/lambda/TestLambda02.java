package com.wyg.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-03 11:57
 **/
public class TestLambda02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("C","B","A");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);


        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);
    }
}
