package com.yang.jzoffer.num21;

import java.util.LinkedList;

/**
 * Created by wangchenyang on 17-7-25.
 */

/*
输入两个整数序列，第一个序列表示栈的压入顺序，
请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */

public class Solution {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0) return false;
        LinkedList<Integer> stack = new LinkedList<>();
        int j = 0;
        stack.push(pushA[j++]);
        for (int i = 0; i < popA.length; i++) {
            if (popA[i] == stack.getFirst()) {
                stack.removeFirst();
            } else {
                while (j <  popA.length && popA[i] != pushA[j]) {
                    stack.addFirst(pushA[j++]);
                }
                if (j == popA.length)
                    return false;
                else
                    j++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsPopOrder(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2}));
    }
}
