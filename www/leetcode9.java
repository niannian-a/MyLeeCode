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
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        boolean result = Solution.isPalindrome(x);
//        System.out.println(result);
        int n= (int) (151/ Math.pow(10,2));
        System.out.println(n);

    }
    public  static class Solution {
        public static boolean isPalindrome(int x) {
            boolean result=true;
            if(x<0){
                return false;
            }else {//大于等于0 x%100 百位
                //判断位数
                double b=1;
                while((x% Math.pow(10,b))!=x){//
                    b++;
                }
                //b 位数
                double i=b;//从最高位开始

            }
            return result;

        }
    }

}
