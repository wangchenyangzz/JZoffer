package com.yang.jzoffer.num20;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by wangchenyang on 17-7-23.
 */
/*
定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class Solution {
    LinkedList<Integer> list = new LinkedList<>();

    public void push(int node) {
        list.addFirst(node);
    }

    public void pop() {
        list.removeFirst();
    }

    public int top() {
        return list.element();
    }

    public int min() {
        int min = list.element();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
