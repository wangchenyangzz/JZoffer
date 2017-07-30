package com.yang.jzoffer.num40;

/**
 * Created by wangchenyang on 17-7-30.
 */

/*
一个整型数组里除了两个数字之外，其他的数字都出现了两次。
请写程序找出这两个只出现一次的数字。
 */

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null && array.length < 2)
            return;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp ^= array[i];
        }
        int first = find(temp);
        for (int i = 0; i < array.length; i++) {
            if (isBit(array[i],first)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }

    private boolean isBit(int num, int first) {
        if (num >> first == 0)
            return false;
        else
            return true;
    }

    private int find(int temp) {
        int index = 0;
        while ((temp & 1) == 0 && index < 8 * 4) {
            temp = temp >> 1;
            index++;
        }
        return index;
    }
}