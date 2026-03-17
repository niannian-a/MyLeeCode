package com.leecode.www;

public class leetcode11 {
//给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
//找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//返回容器可以储存的最大水量。
//说明：你不能倾斜容器。
/*示例 1：
输入：[1,8,6,2,5,4,8,3,7]
输出：49
解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
示例 2：
输入：height = [1,1]
输出：1*/
public static void main(String[] args) {
    int height[]= {8,7,2,1};
    int maxarea=Solution.maxArea(height);
    System.out.println(maxarea);
    //0 1 2 3 4 5 6 7 8
    //1 8 6 2 5 4 8 3 7
}
public static class  Solution {
    public static int maxArea(int[] height) {
        int maxarea=0;
        for(int i=0;i<height.length;i++){//9
            for(int j=height.length-1;j>0;){
                if(height[i]>height[j]){
                    if(maxarea<height[j]*(j-i)){
                        maxarea=height[j]*(j-i);//<赋值
                    }
                    j--;
                }else {
                    if(maxarea<height[i]*(j-i)){
                    maxarea=height[i]*(j-i);//<赋值
                }
                    break;
                }
            }
        }
        return maxarea;
    }
}
}
