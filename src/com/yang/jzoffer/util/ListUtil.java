package com.yang.jzoffer.util;

import com.example.wangchenyang.algorithms.ListNode;

import java.util.Scanner;

/**
 * Created by wangchenyang on 17-7-16.
 */

public class ListUtil {
    public static void add(ListNode list) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        list.next = new ListNode(num);
        while (num != 9999) {
            list.next = new ListNode(num);
            list = list.next;
            num = in.nextInt();
        }
    }
}
