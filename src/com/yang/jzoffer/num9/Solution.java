package com.yang.jzoffer.num9;

/**
 * Created by wangchenyang on 17-7-21.
 */

/*
一只青蛙一次可以跳上1级台阶，
也可以跳上2级……它也可以跳上n级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
数学归纳法。
 */
public class Solution {
    public int JumpFloorII(int target) {
        if (target == 0)
            return 0;
        int[] step= new int[target + 1];
        if (target == 1) {
            step[1] = 1;
            return 1;
        }
        for (int i = 3; i < step.length; i++) {
            step[i] = 2 * step[i - 1];
        }
        return step[target];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().JumpFloorII(5));
    }
}
