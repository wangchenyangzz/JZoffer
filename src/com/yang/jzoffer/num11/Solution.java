package com.yang.jzoffer.num11;

/**
 * Created by wangchenyang on 17-7-22.
 */

/*
输入一个整数，输出该数二进制表示中1的个数。
其中负数用补码表示。
 */

/*
10100
10100 & 10011 = 10000
10000 & 01111 = 00000
所以两个１
思路：将n与n-1想与会把n的最右边的1去掉，比如
1100&1011 = 1000
再让count++即可计算出有多少个1
 */
public class Solution {
    public static int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(-5));
    }
}
