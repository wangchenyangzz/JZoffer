package com.yang.jzoffer.num5;

/**
 * Created by wangchenyang on 17-7-17.
 */
import java.util.Stack;

/*
用两个栈来实现一个队列，完成队列的Push和Pop操作。
队列中的元素为int类型。
 */


/*
思路：
    当push时,将栈二转移到栈一，进行push，
    当pop时，将栈一转移到栈二，进行pop。
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int ret = stack2.pop();
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        for (int i = 0 ; i < 3; i++) {
            System.out.println(solution.pop());
        }
    }
}
