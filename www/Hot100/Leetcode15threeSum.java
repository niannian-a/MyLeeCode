package com.leecode.www.Hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15threeSum {
    /*给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]]
    满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
    注意：答案中不可以包含重复的三元组。
    示例 1：
    输入：nums = [-1,0,1,2,-1,-4]
    输出：[[-1,-1,2],[-1,0,1]]
    解释：
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
    不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
    注意，输出的顺序和三元组的顺序并不重要。
    示例 2：
    输入：nums = [0,1,1]
    输出：[]
    解释：唯一可能的三元组和不为 0 。
    示例 3：
    输入：nums = [0,0,0]
    输出：[[0,0,0]]
    解释：唯一可能的三元组和为 0 。*/
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> list= Solution.threeSum(nums);
        System.out.println(list);
    }
    public static class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
            //先对数组排序
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            /*System.out.println(Arrays.toString(nums));*/
            //初始化length
            int length = nums.length;
            if (length == 3) {
                if (nums[0] + nums[1] + nums[2] == 0) {
                    list.add(Arrays.asList(nums[0], nums[1], nums[2]));
                    return list;
                }
                return list;

            } else if (length < 3) {
                return list;
            } else {//大于3
                for (int i = 0; i < length - 2; i++) {
                    if(nums[i]>0){
                        return list;
                    }
                    if(i>0&&nums[i]==nums[i-1]){
                        continue;
                    }
                    int x=i+1;
                    int y=length-1;
                    while(x<y){
                        int sum = nums[i]+nums[x]+nums[y];
                        if(sum>0){
                            while(x<y && nums[y] == nums[--y]);
                        } else if (sum<0) {
                            while(x<y && nums[x] == nums[++x]);
                        }else {
                            list.add(Arrays.asList(nums[i], nums[x], nums[y]));
                            while(x<y && nums[y] == nums[--y]);
                            while(x<y && nums[x] == nums[++x]);
                        }
                    }
                }
            }
            return list;
        }
    }
}
