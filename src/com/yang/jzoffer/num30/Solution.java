package com.yang.jzoffer.num30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wangchenyang on 17-7-26.
 */
/*
HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
今天测试组开完会后,他又发话了:在古老的一维模式识别中,
常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
但是,如果向量中包含负数,是否应该包含某个负数,
并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},
连续子向量的最大和为8(从第0个开始,到第3个为止)。
你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Solution {
    public static int FindGreatestSumOfSubArray(int[] array) {
        int sum = 0;
        int max = 0;
        int min = -Integer.MIN_VALUE;
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                min = array[i];
            }
            sum += array[i];
            if (sum < 0) {
                sum = 0;
                flag++;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return flag != array.length ? max : min;
    }

    public static void main(String[] args) {
        System.out.println(FindGreatestSumOfSubArray(new int[]{-2,-8,-1,-5,-9}));
    }
}
