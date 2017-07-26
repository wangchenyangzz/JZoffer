package com.yang.jzoffer.num27;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by wangchenyang on 17-7-26.
 */
/*
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
/*
字典算法　递归
 */
public class Solution {
    private TreeSet<String> temp = new TreeSet<>() ;

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>() ;
        char[] chars = str.toCharArray() ;
        Permutation(chars, 0, chars.length - 1);
        result.addAll(temp) ;
        return result ;
    }

    public void Permutation(char[] chars, int begin, int end) {
        if (begin == end) {
            temp.add(String.valueOf(chars));
        } else {
            for (int i = begin; i <= end; i++) {
                swap(chars,begin,i);
                Permutation(chars,begin + 1, end);
                swap(chars,begin,i);
            }
        }
    }

    public void swap(char[] x, int a, int b) {
        char t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Permutation("abc"));
    }
}
