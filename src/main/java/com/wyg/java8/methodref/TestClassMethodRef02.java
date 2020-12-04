package com.wyg.java8.methodref;

import java.util.Comparator;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-04 15:47
 **/
public class TestClassMethodRef02 {
    public static void main(String[] args) {
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        Comparator<Integer> c2 = (o1, o2) -> Integer.compare(o1,o2);

        Comparator<Integer> c3 = Integer::compare;



    }
}
