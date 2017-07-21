package com.yang.jzoffer.num7;

/**
 * Created by wangchenyang on 17-7-21.
 */

/*
大家都知道斐波那契数列，
现在要求输入一个整数n，
请你输出斐波那契数列的第n项。
n<=39
 */

public class Solution {
    public int Fibonacci(int n) {
        if (n > 39)
            return -1;
        int[] arr = new int[n+1];
        arr[0] = 0;
        if (n == 0) return 0;
        arr[1] = 1;
        if (n == 1) return 1;
        arr[2] = 1;
        if (n == 2) return 1;
        for (int i = 3; i < n + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().Fibonacci(4));
    }
}