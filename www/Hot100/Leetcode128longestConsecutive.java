package com.leecode.www.Hot100;

import java.util.HashSet;

public class Leetcode128longestConsecutive {
    /*给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
    请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
    示例 1：
    输入：nums = [100,4,200,1,3,2]
    输出：4
    解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
    示例 2：
    输入：nums = [0,3,7,2,5,8,4,6,0,1]
    输出：9
    示例 3：
    输入：nums = [1,0,1,2]
    输出：3*/
    public static void main(String[] args) {
        int[] nums={-1,1,0};
        int count = Solution.longestConsecutive(nums);
        System.out.println(count);
    }
    public static class Solution {
        public static int longestConsecutive(int[] nums) {
            /*int length = nums.length;
            if(length==0){
                return 0;
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < length; i++) {
                map.put(nums[i],i);
            }
            int count=1;
            int temp=1;
            int j=length-1;
            for (int i = 0; i <=j; i++,j--) {
                int k=nums[i];
                k--;//查看有无99\3
                while(true){
                    if(map.containsKey(k)){//有99.无98
                        count++;//count+1=2
                        k--;//继续查找98
                    }else {
                        temp=(count>temp?count:temp);//2
                        count=1;//置零
                        break;
                    }
                }
                k=nums[j];
                k--;//查看有无99\3
                while(true){
                    if(map.containsKey(k)){//有99.无98
                        count++;//count+1=2
                        k--;//继续查找98
                    }else {
                        temp=(count>temp?count:temp);//2
                        count=1;//置零
                        break;
                    }
                }

            }
            return temp;*/
            HashSet<Integer> set = new HashSet<>();
            int length = nums.length;
            for (int i = 0; i < length; i++) {
                set.add(nums[i]);
            }
//            System.out.println(set);
            int count=0;
            for (Integer s : set){
                if(set.contains(s-1))
                {
                    continue;
                }else
                {
                    int y=s+1;
                    while(set.contains(y)){
                        y++;
                    }
                    count = count>y-s?count:y-s;
                }

            }
            return count;
        }
    }
}
