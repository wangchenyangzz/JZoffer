package com.yang.jzoffer.num31;

/**
 * Created by wangchenyang on 17-7-27.
 */

/*
求出1~13的整数中1出现的次数,
并算出100~1300的整数中1出现的次数？
为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现5次,
但是对于后面问题他就没辙了。
ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 */
/*
long count=0;
   long i=1;
   for(i=1;i<=n;i*=10){
     long a=n/i,b=n%i;
     count=count+(a+8)/10*i;
     if(a%10==1){
       count+=b+1;
     }
     return (int)count;
 */
public class Solution {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i,b = n % i;
            //之所以补8，是因为当百位为0，则a/10==(a+8)/10，
            //当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a + 8) / 10 * i + ((a % 10 == 1) ? b + 1 : 0);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Solution.NumberOf1Between1AndN_Solution(1300));
    }
}
