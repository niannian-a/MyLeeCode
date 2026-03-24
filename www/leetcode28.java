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
                    //needle和haystack未超出length-1 且 string不为记录值 且 两个下标值对应的字符相等 例如 mississippi issip 1&0 i
                    string++;
                    match++;//移位继续判断匹配
                }else{
                    if (match==needle.length()){//match遍历完只说明 不满足条件 未超出length、不为记录值 即match所有值能在string中找到 即返回 string-needle.length()
                        return string-needle.length();
                    }else if(string<haystack.length()-1){//如果match未遍历完 且 string未超出length 即不匹配但string仍剩下字符
//                        if(string==0){//如果string
//                            string++;
//                            match=0;
//                        }else {
                        record=string-match;//记录从record开始不匹配
                        string=string-match+1;//继续匹配
                        match=0;//从needle开始继续匹配
                        //}
                    }else {
                        return -1;
                    }
                }
            }

            return -1;
        }
    }
}
