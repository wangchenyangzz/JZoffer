package com.yang.jzoffer.num6;

import java.util.ArrayList;

/**
 * Created by wangchenyang on 17-7-21.
 */

/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
*/

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int size = array.length;
        if (size == 0) {
            return 0;
        }
        int i = 0, j = size - 1;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (array[mid] == array[i] && array[mid] == array[j]) {
                return array[i];
            }
            if (array[mid] >= array[i]) {
                i = mid;
            } else {
                j = mid;
            }
            if (j - i == 1)
                break;
        }
        return array[j];
    }

    public static void main(String[] args) {
        int i = new Solution().minNumberInRotateArray(new int[]{2,2,2,1,1});
        System.out.println(i);
    }
}
