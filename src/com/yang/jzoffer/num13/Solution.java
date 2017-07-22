package com.yang.jzoffer.num13;

/**
 * Created by wangchenyang on 17-7-22.
 */
/*
输入一个整数数组，
实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，
所有的偶数位于位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
/*
类似冒泡算法，
前偶后奇数就交换：
 */
public class Solution {
    public static void reOrderArray(int [] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] % 2 == 1 && array[j - 1] % 2 == 0)
                    swap(array,j,j-1);
            }
        System.out.println("1");
    }

    private static void swap(int[] array, int j, int i) {
        int t = array[j];
        array[j] = array[i];
        array[i] = t;
    }


    public static void main(String[] args) {
        reOrderArray(new int[]{
                1,3,2,4,6,8,7,5,9
        });
    }
}
