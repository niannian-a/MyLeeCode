package com.leecode.www;
//编写一个函数来查找字符串数组中的最长公共前缀。
//如果不存在公共前缀，返回空字符串 ""。
//示例 1：
//输入：strs = ["flower","flow","flight"]
//输出："fl"
//示例 2：
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。
//缩短前缀法！！！
public class leetcode14 {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        String samestr=Solution.longestCommonPrefix(strs);
        System.out.println(samestr);

    }
    public static class Solution {
        public static String longestCommonPrefix(String[] strs) {
            String samestr="";
            String str=strs[0];//str-ab
            String temp="";
            for(int i=0;i<str.length();i++){//str.length()-2
                char ch=str.charAt(i);//Apple-A
                for (int j=1;j<strs.length;j++)//strs.length-2
                {
                    temp=strs[j];//Appaa
                    if(i+1<=temp.length()){
                        if(ch!=temp.charAt(i)){//not equal
                            return samestr;
                        }
                    }else {
                        return samestr;
                    }
                }
                samestr+=str.charAt(i);
            }
            return samestr;
        }
    }
}
