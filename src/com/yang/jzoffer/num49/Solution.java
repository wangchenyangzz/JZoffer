package com.yang.jzoffer.num49;

/**
 * Created by wangchenyang on 17-8-1.
 */

/*
将一个字符串转换成一个整数，
要求不能使用字符串转换整数的库函数。
数值为0或者字符串不是一个合法的数值则返回0
 */
public class Solution {
    public int StrToInt(String str) {
        char[] arr = str.toCharArray();
        if(arr.length == 0) return 0;
        int num = 0;
        int i;
        for (i = arr.length - 1; i > 0; i--) {
            if (arr[i] > '0' && arr[i] < '9') {
                num += (arr[i] - 48) * Math.pow(10,arr.length-1-i);
            } else {
                break;
            }
        }
        if (i > 0)
            return 0;
        else if (arr[i] == '+') {
            return num;
        } else if(arr[i] == '-') {
            if(num == 2147483647 && arr[arr.length-1] == '8')
                return -2147483648;
            return -num;
        } else if (arr[i] < '0' || arr[i] > '9'){
            return 0;
        } else {
            return (int)(num + (arr[i] - 48) * Math.pow(10,arr.length-1-i));
        }
    }
}
