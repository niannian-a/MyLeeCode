package com.leecode.www.Hot100;

public class Leetcode283moveZeroes {
    /*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    请注意 ，必须在不复制数组的情况下原地对数组进行操作。
    示例 1:
    输入: nums = [0,1,0,3,12]
    输出: [1,3,12,0,0]
    示例 2:
    输入: nums = [0]
    输出: [0]*/
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        Solution.moveZeroes(nums);
    }
    public static class Solution {
        public static void moveZeroes(int[] nums) {
            /*int length = nums.length;
            for (int i = 0; i < length; i++) {//i find 0
                if(nums[i]==0){
                    for (int j = i; j < length; j++) {//j find !0
                        if(nums[j]!=0){
                            int temp = nums[i];
                            nums[i]=nums[j];
                            nums[j]=temp;
                            break;
                        }
                    }
                }
            }
            System.out.print("[");
            for (int i = 0; i < length; i++) {
                if(i==length-1){
                    System.out.print(nums[i]+"]");
                }else {
                    System.out.print(nums[i]+",");
                }
            }*/
            int length = nums.length;
            int [] temp = new int[length];
            int indextemp=0;
            for (int i = 0; i < length; i++) {
                if(nums[i]!=0){
                    temp[indextemp]=nums[i];
                    indextemp++;
                }
            }
            /*for (int i = 0; i < length; i++) {
                System.out.println(temp[i]);
            }*/
            for (int i = 0; i < length; i++) {
                nums[i]=temp[i];
            }
            for (int i = 0; i < length; i++) {
                System.out.println(nums[i]);
            }
        }
    }
}
