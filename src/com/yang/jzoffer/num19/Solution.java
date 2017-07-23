package com.yang.jzoffer.num19;

import java.util.ArrayList;

/**
 * Created by wangchenyang on 17-7-23.
 */

/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (matrix.length == 0) return result;
        int n = matrix.length;
        int m = matrix[0].length;
        if (m == 0) return result;
        int layers = (Math.min(m, n) - 1) / 2;
        for (int i = 0; i < layers; i++) {
            for (int k = i; k < m - i; k++) result.add(array[i][k]);
            for (int j = i + 1; j < n - i; j++) result.add(array[j][m - i - 1]);
            for (int k = m - i - 2; (k >= i); k--) result.add(array[n - i - 1][k]);
            for (int j = n - i - 2; (j > i); j--) result.add(array[j][i]);
        }
        return result;
    }
}
