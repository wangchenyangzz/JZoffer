package com.yang.jzoffer.num3;

import com.yang.jzoffer.ListNode;
import com.yang.jzoffer.util.ListUtil;

import java.util.ArrayList;
import java.util.LinkedList;

/*
输入一个链表，从尾到头打印链表每个节点的值。
 */


public class Solution {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (listNode != null) {
            linkedList.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!linkedList.isEmpty()) {
            arrayList.add(linkedList.removeLast());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListUtil.add(listNode);
        System.out.println(printListFromTailToHead(listNode));
    }
}
