package com.yang.jzoffer.num33;

/**
 * Created by wangchenyang on 17-7-27.
 */

/*

把只包含因子2、3和5的数称作丑数（Ugly Number）。
例如6、8都是丑数，但14不是，因为它包含因子7。
 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index == 0) return 0;
        int[] array = new int[index];
        int a = 0, b = 0 , c = 0;
        array[0] = 1;
        for (int i = 1; i < index; i++) {
            array[i] = Math.min(Math.min(array[a] * 2, array[b] * 3), array[c] * 5);
            if (array[i] == array[a] * 2) a++;
            if (array[i] == array[b] * 3) b++;
            if (array[i] == array[c] * 5) c++;
        }
        return array[index - 1];
    }
}
