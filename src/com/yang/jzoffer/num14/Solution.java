package com.yang.jzoffer.num14;

import com.yang.jzoffer.ListNode;
import com.yang.jzoffer.util.ListUtil;


/**
 * Created by wangchenyang on 17-7-22.
 */

/*
输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        int i = 0;
        int flag = 0;
        ListNode p = head;
        ListNode q = head;
        while (p != null) {
            p = p.next;
            i++;
            if (i == k) {
                flag = 1;
            }
            if (i > k) {
                q = q.next;
                flag = 1;
            }
        }
        return flag == 1?q:null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListUtil.add(head);
        System.out.println(new Solution().FindKthToTail(head,5).val);
    }
}
