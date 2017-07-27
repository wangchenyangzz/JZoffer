package com.yang.jzoffer.num34;

/**
 * Created by wangchenyang on 17-7-27.
 */
/*
在一个字符串(1<=字符串长度<=10000，全部由字母组成)
中找到第一个只出现一次的字符,并返回它的位置
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int[] arr = new int['z' + 1];
        char[] chs = str.toCharArray();
        for (char ch : chs) {
            arr[ch] += 1;
        }
        for (int i = 0; i < chs.length; i++) {
            if (arr[(int) chs[i]] == 1)
                return i;
        }
        return -1;
    }
}
