package com.yang.jzoffer.num22;

import com.yang.jzoffer.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by wangchenyang on 17-7-25.
 */

/*
从上往下打印出二叉树的每个节点，
同层节点从左至右打印。
 */

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.addFirst(node);
        if (node == null) {
            return null;
        }
        while (!queue.isEmpty()) {
            node = queue.removeLast();
            arrayList.add(node.val);
            if (node.left != null)
                queue.addFirst(node.left);
            if (node.right != null)
                queue.addFirst(node.right);
        }
        return arrayList;
    }
}
