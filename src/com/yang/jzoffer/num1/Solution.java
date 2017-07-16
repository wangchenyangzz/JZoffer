package com.yang.jzoffer.num1;

/**
 * Created by wangchenyang on 17-7-16.
 */

public class Solution {
    /*
     在一个二维数组中，每一行都按照从左到右递增的顺序排序，
     每一列都按照从上到下递增的顺序排序。请完成一个函数，
     输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    public static boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array.length - 1;
        while (j > -1 && i < array[j].length) {  // 先判断行，在判断列
            if (array[j][i] == target) {
                return true;
            } else if (array[j][i] < target){
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] array = {
                {1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}
        };
        System.out.println(Find(5,array));
    }
}
