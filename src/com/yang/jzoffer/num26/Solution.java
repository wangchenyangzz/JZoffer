package com.yang.jzoffer.num26;

import com.yang.jzoffer.TreeNode;

/**
 * Created by wangchenyang on 17-7-26.
 */
/*
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */

/*
中序遍历．将左右相连即可．
 */
public class Solution {
    private TreeNode pHead = null;
    private TreeNode head = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        convert(pRootOfTree);
        return pHead;
    }

    private void convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return;
        convert(pRootOfTree.left);
        if (pRootOfTree == null) {
            pHead = pRootOfTree;
            head = pRootOfTree;
        } else {
            head.right = pRootOfTree;
            pRootOfTree.left = head;
            head = pRootOfTree;
        }
        convert(pRootOfTree.right);
    }
}
