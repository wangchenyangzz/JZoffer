package com.yang.jzoffer.num29;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by wangchenyang on 17-7-26.
 */

/*
输入n个整数，找出其中最小的K个数。
例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        if (k > input.length) return list;
        for (int i = 0; i < input.length; i++) {
            queue.offer(input[i]);
        }
        for (int j = 0; j < k; j++) {
            list.add(queue.poll());
        }
        return list;
    }
}
