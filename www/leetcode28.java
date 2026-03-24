package com.leecode.www;

public class leetcode28 {
    //给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
    // 如果 needle 不是 haystack 的一部分，则返回  -1 。
    //示例 1：
    //输入：haystack = "sadbutsad", needle = "sad"
    //输出：0
    //解释："sad" 在下标 0 和 6 处匹配。
    //第一个匹配项的下标是 0 ，所以返回 0 。
    //示例 2：
    //输入：haystack = "leetcode", needle = "leeto"
    //输出：-1
    //解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
    public static void main(String[] args) {
        String str1="mississippi";
        String str2="issip";
        int result=Solution.strStr(str1,str2);
        System.out.println(result);
    }
    public static class Solution {
        public static int strStr(String haystack, String needle) {
            int string=0;//定义haystack的指针
            int match=0;//定义needle的指针
            int record=-1;
            //asadbutsad  sad
            //先寻找str2首字母的下标
            while (string<=haystack.length()){
                if (match<needle.length()&&string<haystack.length()&&string!=record&&haystack.charAt(string)==needle.charAt(match)){
                    string++;
                    match++;
                }else{
                    if (match==needle.length()){
                        return string-needle.length();
                    }else if(string<haystack.length()-1){
                        if(string==0){
                            string++;
                            match=0;
                        }else {
                            record=string-match;//记录从record开始不匹配
                            string=string-match+1;
                            match=0;
                        }
                    }else {
                        return -1;
                    }
                }
            }

            return -1;
        }
    }
}
