package com.yang.jzoffer.num42;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by wangchenyang on 17-7-31.
 */
/*
输入一个递增排序的数组和一个数字S，
在数组中查找两个数，是的他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int ano = sum - array[i];
            int j = Arrays.binarySearch(array,ano);
            if (j > 0) {
                list.add(array[i]);
                list.add(ano);
                break;
            }
        }
        return list;
    }
}
