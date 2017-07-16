package com.yang.jzoffer.num2;

/**
 * Created by wangchenyang on 17-7-16.
 */

public class Solution {
    /*
    请实现一个函数，将一个字符串中的空格替换成“%20”。
    例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */
    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        return s.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
    }
}
