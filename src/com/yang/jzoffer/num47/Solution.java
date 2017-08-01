package com.yang.jzoffer.num47;

/**
 * Created by wangchenyang on 17-8-1.
 */
/*
求1+2+3+...+n，要求不能使用乘除法
、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Solution {
    public static int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (sum > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(100));
    }
}
