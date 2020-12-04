package com.wyg.java8.interf;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-03 11:03
 **/
public class TestFunctionInterface02 {

    public static void main(String[] args) {
        //1.消费型接口
        Consumer<String> consumer = new Consumer<String>() {
            /**
             * Performs this operation on the given argument.
             *
             * @param t the input argument
             */
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };
        consumer.accept("hello word");

        //函数式接口
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
        Integer result = function.apply("100");
        System.out.println(result);

        //判定型接口
        Predicate<String> predicate = new Predicate<String>() {
            List<String> list = Arrays.asList("A","B","C");
            @Override
            public boolean test(String s) {
                return list.contains(s);
            }
        };
        System.out.println(predicate.test("A"));

        //供给型接口
        Supplier<Object> supplier = new Supplier<Object>() {
            @Override
            public Object get() {
                return new Object();
            }
        };
        System.out.println(supplier.get());
    }
}
