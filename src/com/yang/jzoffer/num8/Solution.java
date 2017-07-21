package com.yang.jzoffer.num8;

/**
 * Created by wangchenyang on 17-7-21.
 */

/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution {
    public int JumpFloor(int target) {
        int[] step = new int[target + 1];
        step[1] = 1;
        if (target == 1)
            return 1;
        step[2] = 2;
        if (target == 2)
            return 2;
        for (int i = 3; i < target + 1; i++) {
            step[i] = step[i - 1] + step[i - 2];
        }
        return step[target];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().JumpFloor(5));
    }
}
