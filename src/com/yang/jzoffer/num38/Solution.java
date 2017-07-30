package com.yang.jzoffer.num38;

import com.yang.jzoffer.TreeNode;

/**
 * Created by wangchenyang on 17-7-30.
 */

/*
输入一棵二叉树，求该树的深度。
从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
最长路径的长度为树的深度。
 */
public class Solution {
    private int max = 0;

    public int TreeDepth(TreeNode root) {
        deepth(root,1);
        return max;
    }

    private void deepth(TreeNode root, int deep) {
        if (root == null) return;
        max = Math.max(max, deep);
        deepth(root.left,deep+1);
        deepth(root.right,deep+1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(3);
        System.out.println(solution.TreeDepth(node));

    }
}
