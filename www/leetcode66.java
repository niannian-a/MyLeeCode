package com.leecode.www;

import java.util.Arrays;

public class leetcode66 {
    //给定一个表示 大整数 的整数数组 digits，其中 digits[i] 是整数的第 i 位数字。这些数字按从左到右，从最高位到最低位排列。这个大整数不包含任何前导 0。
    //将大整数加 1，并返回结果的数字数组。
    //示例 1：
    //输入：digits = [1,2,3]
    //输出：[1,2,4]
    //解释：输入数组表示数字 123。
    //加 1 后得到 123 + 1 = 124。
    //因此，结果应该是 [1,2,4]。
    //示例 2：
    //输入：digits = [4,3,2,1]
    //输出：[4,3,2,2]
    //解释：输入数组表示数字 4321。
    //加 1 后得到 4321 + 1 = 4322。
    //因此，结果应该是 [4,3,2,2]。
    //示例 3：
    //输入：digits = [9]
    //输出：[1,0]
    //解释：输入数组表示数字 9。
    //加 1 得到了 9 + 1 = 10。
    //因此，结果应该是 [1,0]。
    public static void main(String[] args) {
        int[] digits= {1, 2, 3};
        int[] result=Solution.plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
    public static class Solution {
        public static int[] plusOne(int[] digits) {
            int[] result = new int[digits.length];
            int i=digits.length-1;//从数组末尾开始
            while(i>=0){
                if(digits[i]!=9){//末尾不为9，不进位
                    digits[i]++;
                }else {
                    while (i!=0){//不为开头则执行置0
                        //为9 判断当前位i是否为数组开头
                        digits[i]=0;
                        i--;
                    }//为开头 例如9999
                    result[0]=1;
                    return result;
                    
                }
            }

            return result;

        }
    }
}
