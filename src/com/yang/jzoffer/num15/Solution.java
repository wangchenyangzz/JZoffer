package com.yang.jzoffer.num15;

/**
 * Created by wangchenyang on 17-7-23.
 */

import com.yang.jzoffer.ListNode;
import com.yang.jzoffer.util.ListUtil;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */

/*
尾插法
 */

public class Solution {
    public static ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(-1);
        ListUtil.add(node);
        ListNode edon = ReverseList(node);
        while (edon != null) {
            System.out.println(edon.val);
            edon = edon.next;
        }
    }
}