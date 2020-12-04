package com.wyg.java8.lambda;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-03 12:06
 **/
public class TestLambda03 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("execute task");
            }
        }).start();

        System.out.println("++++++++++++++++++++++++++++lambda+++++++++++++++++++++++++++");

        new Thread(() -> System.out.println("execute task")).start();
    }
}
