package com.yang.jzoffer.num18;

import com.yang.jzoffer.TreeNode;

/**
 * Created by wangchenyang on 17-7-23.
 */

/*
操作给定的二叉树，将其变换为源二叉树的镜像。
二叉树的镜像定义：源二叉树
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
public class Solution {
    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        else {
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
        }
        Mirror(root.left);
        Mirror(root.right);
    }
}
