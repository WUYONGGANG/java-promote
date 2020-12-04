package com.wyg.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-04 17:26
 **/
public class TestStream02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30);
        //创建流对象
        //1.方式1
        //list.stream().forEach(t -> System.out.println(t));
        //顺序流
        //list.stream().forEach(System.out::println);
        //并行流
        list.parallelStream().forEach(System.out::println);

        //方式2
        IntStream is = Arrays.stream(new int[] {1,2,3});
        is.forEach(System.out::println);
        //方式3
        Stream.of(4,5,6).forEach(System.out::println);
        //Stream.iterate(2, t -> t + 2).forEach(System.out::println);
        Stream.generate(() -> UUID.randomUUID().toString()).forEach(System.out::println);



    }

}
