package com.leecode.www;

public class leetcode35 {
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
    //如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    //请必须使用时间复杂度为 O(log n) 的算法。
    //示例 1:
    //输入: nums = [1,3,5,6], target = 5
    //输出: 2
    //示例 2:
    //输入: nums = [1,3,5,6], target = 2
    //输出: 1
    //示例 3:
    //输入: nums = [1,3,5,6], target = 7
    //输出: 4
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,9};
        int target=0;
        int index=Solution.searchInsert(nums,target);
        System.out.println(index);

    }
    public static class Solution {
        public static int searchInsert(int[] nums, int target) {
            int left=0;
            if(nums.length==0){
                return 0;
            }else {
                if(target<=nums[0]){
                    return 0;
                }else if(target>nums[nums.length-1]){
                    return nums.length;
                }else {
                    while (!(target>nums[left]&&target<=nums[left+1])){
                        left++;
                        if(left>=nums.length-1){
                            return nums.length;
                        }
                    }
                    return left+1;
                }

            }
        }
    }
}
