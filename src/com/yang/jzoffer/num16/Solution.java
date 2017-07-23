package com.yang.jzoffer.num16;

import com.yang.jzoffer.ListNode;
import com.yang.jzoffer.util.ListUtil;

/**
 * Created by wangchenyang on 17-7-23.
 */
public class Solution {
    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(-1);
        ListNode list = list3;
        ListNode p = list1;
        ListNode q = list2;
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        while (true) {
            if (p == null) {
                list3.next = q;
                break;
            } else if (q == null) {
                list3.next = p;
                break;
            }
            if (p.val >= q.val) {
                list3.next = q;
                q = q.next;
            } else if (p.val < q.val) {
                list3.next = p;
                p = p.next;
            }
            list3 = list3.next;
        }
        return list.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(1);
        ListUtil.add(list1);
        ListUtil.add(list2);
        ListNode list3 = Merge(list1,list2);
        while (list3 != null) {
            System.out.println(list3.val);
            list3 = list3.next;
        }
    }
}
