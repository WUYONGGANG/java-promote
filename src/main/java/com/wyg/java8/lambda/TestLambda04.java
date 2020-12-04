package com.wyg.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: java-promote
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2020-12-03 12:09
 **/
public class TestLambda04 {
    public static void main(String[] args) {
        String[] strArray = {"ab","DEFL","bcd"};
        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        // =====================lambda=======================
        Arrays.sort(strArray, (o1, o2) -> o1.length() - o2.length());
    }
}
