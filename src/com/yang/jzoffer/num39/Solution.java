package com.yang.jzoffer.num39;

import com.yang.jzoffer.TreeNode;

/**
 * Created by wangchenyang on 17-7-30.
 */
/*
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Solution {
    private boolean isBalanced = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        deepteh(root);
        return isBalanced;
    }

    public int deepteh(TreeNode root) {
        if (root == null) return 0;
        int left = deepteh(root.left);
        int right = deepteh(root.right);
        if (Math.abs(left - right) > 1) isBalanced = false;
        return left > right ? left +1 : right + 1;
    }
}
