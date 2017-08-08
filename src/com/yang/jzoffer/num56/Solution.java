package com.yang.jzoffer.num56;

import com.yang.jzoffer.ListNode;
import com.yang.jzoffer.util.ListUtil;

/**
 * Created by wangchenyang on 17-8-3.
 */
/*
在一个排序的链表中，存在重复的结点，
请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Solution {
    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;
        ListNode p = pHead;
        ListNode q = pHead.next;
        ListNode pre = new ListNode(-1);
        pre.next = p;
        ListNode head = pre;
        while (q != null) {
            if (p.val != q.val) {
                pre = pre.next;
                p = p.next;
                q = q.next;
            } else {
                while (p.val == q.val) {
                    q = q.next;
                    if (q == null)
                        break;
                }
                pre.next = q;
                if (q == null)
                    break;
                p = q;
                q = q.next;
            }
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(1);
        deleteDuplication(node);
    }
}
