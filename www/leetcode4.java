package com.leecode.www;

import javax.print.attribute.standard.MediaName;
import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode4 {
/*给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
算法的时间复杂度应该为 O(log (m+n)) 。
示例 1：
输入：nums1 = [1,3], nums2 = [2]
输出：2.00000
解释：合并数组 = [1,2,3] ，中位数 2
示例 2：
输入：nums1 = [1,2], nums2 = [3,4]
输出：2.50000
解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5*/
public static void main(String[] args) {
    int nums1[] = {1,3};
    int nums2[] = {2,4};
    double median=Solution.findMedianSortedArrays(nums1,nums2);
    System.out.println(median);
}
    public static class Solution {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int nums[]=new int[nums1.length+nums2.length];//1,3 2,4
            int i = 0, j = 0, k = 0;

            // 双指针比较，依次放入较小的元素
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    nums[k++] = nums1[i++];
                } else {
                    nums[k++] = nums2[j++];
                }
            }

            // 将剩余元素加入结果数组
            while (i < nums1.length) {
                nums[k++] = nums1[i++];
            }
            while (j < nums2.length) {
                nums[k++] = nums2[j++];
            }

            System.out.println(Arrays.toString(nums));
            double median;
            double median1;
            double median2;
            if(nums.length%2==0){
                //偶数
                median1=nums[(nums.length)/2-1];
                median2=nums[nums.length/2];
                median=(median1+median2)/2;
            }else {
                median=nums[(nums.length+1)/2-1];
            }

            return median;
        }


    }



}
