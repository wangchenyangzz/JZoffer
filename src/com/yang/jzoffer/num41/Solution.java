package com.yang.jzoffer.num41;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by wangchenyang on 17-7-31.
 */

/*
小明很喜欢数学,有一天他在做数学作业时,
要求计算出9~16的和,他马上就写出了正确答案是100。
但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */
/*
输出所有和为S的连续正数序列。
序列内按照从小至大的顺序，
序列间按照开始数字从小到大的顺序
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> retList = new ArrayList<>();
        ArrayList<Integer> oneList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int num = sum / 2 + 1;
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
            if (result  > sum) {
                linkedList.addLast(i);
                while (result > sum) {
                    result -= linkedList.removeFirst();
                    if (result == sum) {
                        oneList.addAll(linkedList);
                        retList.add(oneList);
                        oneList = new ArrayList<>();

                    }
                }
            } else if (result < sum) {
                linkedList.addLast(i);
            } else {
                linkedList.addLast(i);
                oneList.addAll(linkedList);
                retList.add(oneList);
                oneList = new ArrayList<>();
            }
        }
        return retList;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().FindContinuousSequence(15));
    }
}
