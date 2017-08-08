package com.yang.jzoffer.num59;

import com.yang.jzoffer.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by wangchenyang on 17-8-3.
 */
/*
请实现一个函数按照之字形打印二叉树，
即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，
第三行按照从左到右的顺序打印，
其他行以此类推。
 */

public class Solution {
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        boolean director = true;
        if (pRoot == null) return ret;
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> pl = new LinkedList<>();
        pl.add(null);
        pl.add(pRoot);
        while (pl.size() != 1) {
            TreeNode node = pl.removeFirst();
            Iterator<TreeNode> iter = null;
            if (node == null) {
                if (director)
                    iter = pl.iterator();
                else
                    iter = pl.descendingIterator();
                while (iter.hasNext()) {
                    TreeNode treeNode = iter.next();
                    list.add(treeNode.val);
                }
                ret.add(new ArrayList<>(list));
                list.clear();
                pl.addLast(null);
                director = !director;
                continue;
            }
            if (node.left != null) {
                pl.addLast(node.left);
            }
            if (node.right != null) {
                pl.addLast(node.right);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
        System.out.println(Print(node));
    }
}
