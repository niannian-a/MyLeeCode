package com.leecode.www.Hot100;

import java.util.ArrayList;

public class Leetcode42 {
    /*给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
    输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
    示例 1：
    输出：6
    解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
    示例 2：
    输入：height = [4,2,0,3,2,5]
    输出：9*/
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int value=Solution.trap(height);
        System.out.println(value);

    }
    public static class Solution {
        public static int trap(int[] height) {
            /*int length=height.length;
            int value=0;
            //0,    1,0,2      (2),1,0,1,3        (3),2,1,2      ,1    height
            //0     1 2 3          4 5 6 7            8 9 10      11   index
            //min1 >0 (1-1)*1=1;min2 1,0,1 1+2+1=4;min2 1 1 =6
            int max=0;
            for (int i = 0; i < length; i++) {//先判断内部有没有分割点
                int tempmax=height[i];
                max=Math.max(tempmax,max);
            }
            if(max<=height[0]||max<=height[length-1]){
                int tempvalue=0;
                for (int j = 0; j < length; j++) {
                    tempvalue+=(Math.min(height[0],height[length-1])-height[j])>0?Math.min(height[0],height[length-1])-height[j]:0;
                }
                return tempvalue;
            }

            for (int i = 0; i < length-1;) {//循环判断前后大小关系不同的
                int edge=i;
                int tempvalue=0;
                //寻找
                if(height[i]<=height[i+1]){//左边界高度不足以作为边界
                    i++;
                    continue;//i++查找下一个
                }else{//可以作为边界,edge指针从i+1开始
                    edge=i+1;
                    int[] temp=new int[length];
                    int index=0;
                    temp[index]=height[i];//先存入左边界1
                    index++;
                    if(edge>=length-1){
                        break;
                    }
                    while((height[edge]<=height[edge+1])||height[edge-1]>=height[edge]){//不满足边界条件
                        //存入数组
                        temp[index]=height[edge];
                        edge++;//向后移动直到找到边界即height[edge]>height[edge+1]
                        index++;
                        if(edge>=length-1){
                            break;
                        }
                    }//满足边界条件
                    temp[index]=height[edge];//加入最后右边界
                    int templength=index+1;
                    for (int j = 0; j < templength; j++) {
                        tempvalue+=(Math.min(temp[0],temp[templength-1])-temp[j])>0?Math.min(temp[0],temp[templength-1])-temp[j]:0;
                    }
                }
                value+=tempvalue;
                i=edge;
            }
            return value;*/
            int length= height.length;
            ArrayList<Integer> list1 = new ArrayList<>(length);
            ArrayList<Integer> list2 = new ArrayList<>(length);
            int value=0;
            //max
            int max=0;
            for (int i = 0; i < length; i++) {
                max=height[i]>max?height[i]:max;
                list1.add(max);
            }
            max=0;
            for (int i = length-1; i >= 0; i--) {
                max=height[i]>max?height[i]:max;
                list2.add(max);
            }
            for (int i = 0; i < length; i++) {
                int level=Math.min(list1.get(i),list2.get(length-1-i));
                value+=level-height[i];
            }
            return value;
        }
    }
}

