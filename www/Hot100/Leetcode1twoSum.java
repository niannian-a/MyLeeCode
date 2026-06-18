package com.leecode.www.Hot100;

import java.util.HashMap;

public class Leetcode1twoSum {
    //给定一个整数数组 nums 和一个整数目标值 target，
    //请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
    //你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
    //你可以按任意顺序返回答案。
    //示例 1：
    //输入：nums = [2,7,11,15], target = 9
    //输出：[0,1]
    //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    //示例 2：
    //输入：nums = [3,2,4], target = 6
    //输出：[1,2]
    //示例 3：
    //输入：nums = [3,3], target = 6
    //输出：[0,1]
    public static void main(String[] args) {
        int[] nums = {2,6,7,15};
        int target = 9;
        int[] result=Solution.twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
    public static class Solution {
        public static int[] twoSum(int[] nums, int target) {
//            int length=nums.length;
//            HashMap<Integer,Integer> numshashmap = new HashMap<>();
//            int[] result=new int[2];
//            //把数组放入哈希表
//            for (int i = 0; i < length; i++) {
//                if(numshashmap.containsKey(nums[i])){
//                    result[0]=numshashmap.get(nums[i]);
//                    result[1]=i;
//                    return result;
//                }
//                numshashmap.put(target-nums[i],i);//剩余数放入哈希表,key存储数组值,value存储下标
//
//            }
//            result= new int[]{-1, -1};
//            return result;
            //双向解法
            /*Map<Integer, Integer> map = new HashMap<>();
            map.put(nums[0], 0);//放第一个数
            int i = 1;//从1开始
            int j = nums.length-1;
            int diff = 0;
            Integer index = null;
            while(i<=j) {
                //正向
                diff = target - nums[i];
                index = map.get(diff);
                if (index != null) {
                    return new int[]{index, i};
                }
                map.put(nums[i], i++);
                //反向
                diff = target - nums[j];
                index = map.get(diff);
                if (index != null) {
                    return new int[]{index, j};
                }
                map.put(nums[j], j--);
            }
            return null;*/
            int j=nums.length-1;
            HashMap<Integer,Integer> numshashmap = new HashMap<>();
            numshashmap.put(target-nums[0],0);
            //把数组放入哈希表
            for (int i = 1; i <= j; i++,j--) {
                if(numshashmap.get(nums[i])!=null){
                    return new int[]{numshashmap.get(nums[i]),i};
                }
                numshashmap.put(target-nums[i],i);//剩余数放入哈希表,key存储数组值,value存储下标
                if(numshashmap.get(nums[j])!=null){
                    return new int[]{numshashmap.get(nums[j]),j};
                }
                numshashmap.put(target-nums[j],j);//剩余数放入哈希表,key存储数组值,value存储下标
            }
            return null;
        }
    }
}

