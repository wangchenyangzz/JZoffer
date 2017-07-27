package com.yang.jzoffer.num32;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wangchenyang on 17-7-27.
 */

/*
输入一个正整数数组，
把数组里所有数字拼接起来排成一个数，
打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，
则打印出这三个数字能排成的最小数字为321323。
 */
public class Solution {
    public static String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) return "";
        StringBuffer sb = new StringBuffer();
        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1 = o1 + o2;
                String c2 = o2 + o1;
                return c1.compareTo(c2);
            }
        });
        for (String s: strings) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Solution.PrintMinNumber(new int[]{3,32,321}));
    }
}
