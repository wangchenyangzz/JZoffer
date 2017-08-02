package com.yang.jzoffer.num55;

import com.yang.jzoffer.ListNode;

/**
 * Created by wangchenyang on 17-8-2.
 */
/*
一个链表中包含环，请找出该链表的环的入口结点。
 */
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode p = pHead;
        ListNode q = pHead;
        while (pHead != null && pHead.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                p = pHead;
                while (p != q) {
                    p = p.next;
                    q = q.next;
                }
                return p;
            }
        }
        return null;
    }
}
