package com.yang.jzoffer.num37;

import java.util.Arrays;

/**
 * Created by wangchenyang on 17-7-30.
 */
/*
统计一个数字在排序数组中出现的次数。
 */

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int num = Arrays.binarySearch(array, k);
        if (num < 0) return 0;
        int i = num+1, j = num-1;
        while (array[i] == array[num]) {
            i++;
            if (i == array.length)
                break;
        }
        while (array[j] == array[num]) {
            j--;
            if (j < 0)
                break;
        }
        return i - j + 1;
    }
}
