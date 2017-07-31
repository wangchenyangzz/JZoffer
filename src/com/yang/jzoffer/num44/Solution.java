package com.yang.jzoffer.num44;

/**
 * Created by wangchenyang on 17-7-31.
 */
public class Solution {
    public static String ReverseSentence(String str) {
        String[] strings = str.split(" ");
        if (strings.length == 0) return str;
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]);
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence("  "));
    }
}
