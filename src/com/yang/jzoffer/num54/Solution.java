package com.yang.jzoffer.num54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangchenyang on 17-8-2.
 */
/*
请实现一个函数用来找出字符流中第一个只出现一次的字符。
例如，当从字符流中只读出前两个字符"go"时，
第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，
第一个只出现一次的字符是"l"。
 */
public class Solution {
    private Map<Character,Integer> map = new HashMap<>();
    private List<Character> list = new ArrayList<>();

    public void Insert(char ch) {
        list.add(ch);
        if (map.containsKey(ch)) {
            map.put(ch,1);
        } else {
            map.put(ch,0);
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (Character character : list) {
            if (map.get(character) == 0) {
                return character;
            }
        }
        return '#';
    }
}
