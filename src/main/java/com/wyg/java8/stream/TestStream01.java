package com.wyg.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-04 17:12
 **/
public class TestStream01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,8,7,5,9,10);
        long count = list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 ==0;
            }
        }).count();
        System.out.println(count);

        count = list.stream().filter(t -> t%2 ==0).count();


    }
}
