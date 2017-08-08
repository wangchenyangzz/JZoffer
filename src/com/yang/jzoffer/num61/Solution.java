package com.yang.jzoffer.num61;

import com.yang.jzoffer.TreeNode;

import java.util.HashMap;

/**
 * Created by wangchenyang on 17-8-8.
 */

/*
请实现两个函数，分别用来序列化和反序列化二叉树
 */

public class Solution {
    String Serialize(TreeNode root) {
        if(root == null)
            return "";
        StringBuilder sb = new StringBuilder();
        Serialize2(root, sb);
        return sb.toString();
    }

    void Serialize2(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append("#,");
            return;
        }
        sb.append(root.val + ",");
        Serialize2(root.left, sb);
        Serialize2(root.right, sb);
    }

    int index = -1;

    TreeNode Deserialize(String str) {
        if (str.equals("")) return null;
        String[] ss = str.split(",");
        TreeNode treeNode =  Deserialize2(ss);
        return treeNode;
    }

    TreeNode Deserialize2(String[] str) {
        index++;
        if (!str[index].equals("#")) {
            TreeNode node = new TreeNode(Integer.parseInt(str[index]));
            node.left = Deserialize2(str);
            node.right = Deserialize2(str);
            return node;
        }
        return null;
    }
}
