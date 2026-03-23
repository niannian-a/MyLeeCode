package com.leecode.www;

import java.util.Scanner;

public class leetcode9 {
//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//例如，121 是回文，而 123 不是。
//示例 1：
//输入：x = 121
//输出：true
//示例 2：
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//示例 3：
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
    //最优解
    /*class Solution {
    public boolean isPalindrome(int x) {
        // 1. 边界条件过滤：负数/末尾为0且非0的数，一定不是回文数
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // 2. 初始化反转数：用于存储反转后的后半部分数字
        int revertedNumber = 0;

        // 3. 核心循环：反转后半部分数字，直到原数x小于等于反转数（说明已反转一半以上）
        while(x > revertedNumber){
            // 3.1 把x的最后一位加到反转数末尾（实现反转）
            revertedNumber = revertedNumber*10 + x%10;
            // 3.2 去掉x的最后一位（缩小x，向中间逼近）
            x /= 10;
        }

        // 4. 回文判断：分两种情况
        // - 偶数位：x == revertedNumber（如1221→x=12, revertedNumber=12）
        // - 奇数位：x == revertedNumber/10（如12321→x=12, revertedNumber=123，去掉中间位3）
        return x==revertedNumber||x==revertedNumber/10;
    }
}*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean result = Solution.isPalindrome(x);
        System.out.println(result);
//        int n= (int) (151/ Math.pow(10,2));
//        System.out.println(n);

    }
    public  static class Solution {
        public static boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }else {//大于等于0 x%100 百位
                //判断位数
                double b=1;
                while((x% Math.pow(10,b))!=x){//
                    b++;
                }
                //b 位数
                //判断13431的1 13431/10000=1 13431%10=1
                //13431/10=1343 10的1次方 b-- 4
                //1343%1000=343 10的3次方 b-- 3
                //判断343的3
                //343/10=34 10的1次方 b-- 2
                //34%10=4 10的1次方 b-- 1
                //判断b==1
                b--;
                while(b>0){
                    if((x%10)==((int)(x/Math.pow(10,b)))){//回文
                        x=x/10;
                        b--;
                        x = (int) (x%Math.pow(10,b));
                        b--;
                    }else {
                        return false;
                    }
                }
                return true;

            }

        }
    }

}
