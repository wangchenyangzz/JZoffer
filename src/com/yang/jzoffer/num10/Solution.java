package com.yang.jzoffer.num10;

/**
 * Created by wangchenyang on 17-7-22.
 */

/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */

/*
依然时斐波那契数列
要么横着摆，为n - 1
竖着放，为n - 2
所以　ｆ(n) = f(n-1) + f(n-2)
 */

public class Solution {
    public int RectCover(int target) {
        int[] num = new int[target + 1];
        num[1] = 1;
        if (target == 1)
            return 1;
        num[2] = 2;
        if (target == 2)
            return 2;
        for (int i = 3; i < target + 1; i++) {
            num[i] = num[i-1] + num[i-2];
        }
        return num[target];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().RectCover(4));
    }
}
