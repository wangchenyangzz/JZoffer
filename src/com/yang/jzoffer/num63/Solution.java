package com.yang.jzoffer.num63;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by wangchenyang on 17-8-8.
 */
/*
如何得到一个数据流中的中位数？
如果从数据流中读出奇数个数值，
那么中位数就是所有数值排序之后位于中间的数值。
如果从数据流中读出偶数个数值，
那么中位数就是所有数值排序之后中间两个数的平均值。
 */
public class Solution {
    private int count = 0;
    private PriorityQueue<Integer> minQueue = new PriorityQueue<>();
    private PriorityQueue<Integer> maxQueue = new PriorityQueue<>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public void Insert(Integer num) {
        if (count % 2 == 0) {
            minQueue.offer(num);
            maxQueue.offer(minQueue.poll());
        } else {
            maxQueue.offer(num);
            minQueue.offer(maxQueue.poll());
        }
        count++;
    }

    public Double GetMedia() {
        if (count % 2 == 0) {
            return new Double(minQueue.peek() + maxQueue.peek()) / 2;
        } else {
            return new Double(minQueue.peek());
        }
    }
}
