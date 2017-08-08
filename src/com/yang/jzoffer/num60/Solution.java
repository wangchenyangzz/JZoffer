package com.yang.jzoffer.num60;

import com.yang.jzoffer.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by wangchenyang on 17-8-3.
 */
/*
从上到下按层打印二叉树，
同一层结点从左至右输出。
每一层输出一行。
 */

public class Solution {
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null) return ret;
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> pl = new LinkedList<>();
        pl.add(null);
        pl.add(pRoot);
        while (pl.size() != 1) {
            TreeNode node = pl.removeFirst();
            Iterator<TreeNode> iter = null;
            if (node == null) {
                iter = pl.iterator();
                while (iter.hasNext()) {
                    TreeNode treeNode = iter.next();
                    list.add(treeNode.val);
                }
                ret.add(new ArrayList<>(list));
                list.clear();
                pl.addLast(null);
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
