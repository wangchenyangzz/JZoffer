package com.yang.jzoffer.num58;

import com.yang.jzoffer.TreeNode;

/**
 * Created by wangchenyang on 17-8-3.
 */
/*
请实现一个函数，用来判断一颗二叉树是不是对称的。
注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class Solution {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        return isSymm(pRoot, pRoot.left,pRoot.right);
    }

    private boolean isSymm(TreeNode pRoot, TreeNode left, TreeNode right) {
        if (left == null) return right == null;
        else if (right == null) return false;
        else if (left.val != right.val) return false;
        return isSymm(left,left.left,right.right) && isSymm(right,left.right,right.left);
    }
}
