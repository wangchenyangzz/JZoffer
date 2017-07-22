package com.yang.jzoffer.num12;

/**
 * Created by wangchenyang on 17-7-22.
 */

/*
给定一个double类型的浮点数base和int类型的整数exponent。
求base的exponent次方。
 */

/*
使用快速幂
a^11=a^(2^0+2^1+2^3)
11的二进制是1011
 */
public class Solution {
    public static double Power(double base, int exponent) {
        if ((int)base == 0 && exponent > 0)
            return 0;
        if ((int)base == 0 && exponent > 0)
            System.out.println("错误");
        double ans = 1.0;
        double bs  = base;
        int ex = Math.abs(exponent);
        while (ex != 0) {
            if ((ex & 1) != 0)
                ans = ans * bs;
            bs *= bs;
            ex >>= 1;
        }
        return exponent > 0 ? ans : 1 / ans;
    }

    public static void main(String[] args) {
        System.out.println(Power(2.0,3));
    }
}
