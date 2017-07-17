package com.yang.jzoffer.num4;

import com.yang.jzoffer.TreeNode;

import java.util.HashMap;

/**
 * Created by wangchenyang on 17-7-17.
 */

/*
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            hashMap.put(in[i],i);
        }
        return creteNode(pre, 0 , pre.length -1, in, 0 , in.length - 1, hashMap);
    }
    /*
    index - m  为左子树数量
    i + index - m 为左子树的右边界
    i + index - m　＋　１ 为右子树的左边界
    */

    private TreeNode creteNode(int[] pre, int i, int j, int[] in, int m, int n, HashMap<Integer, Integer> hashMap) {
        if (i > j)
            return null;
        TreeNode node = new TreeNode(pre[i]);
        int index = hashMap.get(pre[i]);
        node.left = creteNode(pre,i+1, i + index - m, in, m,index - 1, hashMap);
        node.right = creteNode(pre,i + index - m + 1, j,in,index + 1,n, hashMap);
        return node;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new Solution().reConstructBinaryTree(new int[]{1, 2, 4, 7, 3, 5, 6, 8}, new int[]{4, 7, 2, 1, 5, 3, 8, 6});
        System.out.println(treeNode);
    }
}