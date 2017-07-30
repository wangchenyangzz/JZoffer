package com.yang.jzoffer.num36;

import com.yang.jzoffer.ListNode;

/**
 * Created by wangchenyang on 17-7-30.
 */

/*
输入两个链表，找出它们的第一个公共结点。
 */

/*
算出长度差，计算．
 */
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        int count1 = 0;
        int count2 = 0;
        while (p1 != null) {
            count1++;
            p1 = p1.next;
        }
        while (p2 != null) {
            count2++;
            p2 = p2.next;
        }
        int flag = count1 - count2;
        if (flag > 0) {
            while (flag > 0) {
                pHead1 = pHead1.next;
                flag--;
            }
            while (pHead1 != pHead2) {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
            return pHead1;
        } else if (flag <= 0) {
            while (flag < 0) {
                pHead2 = pHead2.next;
                flag++;
            }
            while (pHead1 != pHead2) {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
            return pHead2;
        }
        return null;
    }
}
