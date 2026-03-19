package com.leecode.www;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

//给你一个 非严格递增排列的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
// 元素的 相对顺序 应该保持一致 。然后返回 nums 中唯一元素的个数。
//考虑 nums 的唯一元素的数量为 k。去重后，返回唯一元素的数量 k。
//nums 的前 k 个元素应包含 排序后 的唯一数字。下标 k - 1 之后的剩余元素可以忽略。
//如果所有断言都通过，那么您的题解将被 通过。
//示例 1：
//输入：nums = [1,1,2]
//输出：2, nums = [1,2,_]
//解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
//示例 2：
//输入：nums = [0,0,1,1,1,2,2,3,3,4]
//输出：5, nums = [0,1,2,3,4,_,_,_,_,_]
//解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。
// 不需要考虑数组中超出新长度后面的元素。
public class leetcode26 {
    public static void main(String[] args) {
        int[] nums = {1,1,3,4,7,7,8}; // 输入数组
        int k = Solution.removeDuplicates(nums); // 调用
        System.out.println(k);

    }
    public static class Solution {
        public static int removeDuplicates(int[] nums) {
            /*int equal=0;//numsnormal=1
            for(int normal=1;normal<nums.length;)//1,1,3,4,7,7,8 normal=1 numsnaromal=1
            {
                while(true){
                    if(nums[equal]==nums[normal]){
                        //不等：temp暂存-equal、normal++-赋值normal to equal
                        //相等：nromal++
                        normal++;
                        break;
                    }else {
                        int temp=nums[normal];
                        normal++;
                        equal++;
                        nums[equal]=temp;
                        break;
                    }
                }

            }
            int k=equal+1;
            System.out.println(k);
            for(;k<nums.length;k++){
                nums[k]=0;
            }
            System.out.println(Arrays.toString(nums));
            return equal+1;*/
            int equal=0;
            int normal=1;
            while(normal<nums.length){
                if(nums[equal]==nums[normal]){
                    //不等：temp暂存-equal、normal++-赋值normal to equal
                    //相等：nromal++
                    normal++;
                }else {
                    int temp=nums[normal];
                    normal++;
                    equal++;
                    nums[equal]=temp;
                }
            }
            return equal+1;
        }


    }
}
