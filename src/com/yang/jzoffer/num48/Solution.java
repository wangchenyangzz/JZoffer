package com.yang.jzoffer.num48;

/**
 * Created by wangchenyang on 17-8-1.
 */
/*
写一个函数，求两个整数之和，
要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.Add(5,6));
    }

    public static int Add(int num1,int num2) {
        int temp;
        while (num2 != 0) {
            temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }
}
