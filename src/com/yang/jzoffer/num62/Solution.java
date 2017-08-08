package com.yang.jzoffer.num62;

import com.yang.jzoffer.TreeNode;

/**
 * Created by wangchenyang on 17-8-8.
 */
/*
给定一颗二叉搜索树，请找出其中的第k大的结点。
例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，
按结点数值大小顺序第三个结点的值为4。
 */
public class Solution {
    private int k;
    TreeNode KthNode(TreeNode pRoot, int k) {
        this.k = k;
        return find(pRoot);
    }

    private TreeNode find(TreeNode pRoot) {
        TreeNode temp = null;
        if (pRoot != null) {
            if ((temp = find(pRoot.left)) != null) return temp;
            if (--k == 0) return pRoot;
            if ((temp = find(pRoot.right)) != null) return temp;
        }
        return null;
    }
}
