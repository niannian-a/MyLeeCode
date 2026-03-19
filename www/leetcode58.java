package com.leecode.www;

public class leetcode58 {
    //给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
    //单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
    //示例 1：
    //输入：s = "Hello World"
    //输出：5
    //解释：最后一个单词是“World”，长度为 5。
    //示例 2：
    //输入：s = "   fly me   to   the moon  "
    //输出：4
    //解释：最后一个单词是“moon”，长度为 4。
    //示例 3：
    //输入：s = "luffy is still joyboy"
    //输出：6
    //解释：最后一个单词是长度为 6 的“joyboy”。
    public static void main(String[] args) {
        String s = "a ";
        int length = Solution.lengthOfLastWord(s);
        System.out.println(length);

    }
    public static class Solution {
        public static int lengthOfLastWord(String s) {
            //从后往前找第一个非空格字符
            char ch=' ';
            int length=0;
            int i=s.length()-1;//1
            if (s.length() >= 2) {
              while (s.charAt(i)==' '){//true,非空格
                  i--;
              }
              while(s.charAt(i)!=' '){//直到找到空格且i<=0
                  length++;
                  if (i>0){
                      i--;
                  }else {
                      break;
                  }
              }
              return length;
            }else if(s.length()==1){
                if(s==" "){
                    return 0;
                }
                return 1;
            }
            return 0;
        }
    }
}
