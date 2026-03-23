package com.leecode.www;


import javax.xml.transform.sax.SAXTransformerFactory;

public class leetcode20 {
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//有效字符串需满足：
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
//每个右括号都有一个对应的相同类型的左括号。
//示例 1：
//输入：s = "()"
//输出：true
//示例 2：
//输入：s = "()[]{}"
//输出：true
//示例 3：
//输入：s = "(]"
//输出：false
//示例 4：
//输入：s = "([])"
//输出：true
//示例 5：
//输入：s = "([)]"
//输出：false
/*class Solution {
    public boolean isValid(String s) {
        // 1. 边界条件：字符串长度为奇数，直接返回false（括号必须成对出现）
        if (s.length() % 2 != 0)
            return false;
        // 2. left：模拟栈的「栈顶指针」，初始为0（栈空）
        int left = 0;
        // 3. 把字符串转为字符数组，用于模拟栈存储（复用数组节省空间）
        char[] cs = s.toCharArray();
        // 4. 遍历每个字符
        for (char c : cs) {
            // 5. 遇到左括号：将对应的右括号存入「栈」，栈顶指针右移
            if (c == '(')
                cs[left++] = ')'; // 存入')'，left++（栈顶+1）
            else if (c == '[')
                cs[left++] = ']'; // 存入']'，left++
            else if (c == '{')
                cs[left++] = '}'; // 存入'}'，left++
            // 6. 遇到右括号：检查栈是否为空 或 栈顶的右括号与当前字符不匹配
            else if (left == 0 || cs[--left] != c)
                return false; // 匹配失败，直接返回false
        }
        // 7. 遍历结束后，栈必须为空（所有左括号都匹配了对应的右括号）
        return left == 0;
    }
}*/
    public static void main(String[] args) {
        String s="(()";
        boolean result= Solution.isValid(s);
        System.out.println(result);

    }
    public static class Solution {
        public static boolean match(char c,char z){
            if(c=='('&&z==')')
                return true;
            else if(c=='['&&z==']')
                return true;
            else return c == '{' && z == '}';

        }
        public static boolean isValid(String s) {
            //栈实现
            char[] zhan=new char[s.length()];
            int zindex=0;
            int sindex=0;
            //例如([)] 先判断是否为左括号，是则写入，( 栈++
            //[写入 栈：([
            //)右括号则查看栈中最后写入的，判断是否匹配
            //不匹配则输出false
            //匹配则出栈
            while(sindex<=s.length()-1){//0 1 2 3 4 5
                if (s.charAt(sindex)=='('||s.charAt(sindex)=='{'||s.charAt(sindex)=='['){
                    //属于左括号
                    if(sindex==s.length()-1){//只有左括号
                        return false;
                    }else {
                        zhan[zindex]=s.charAt(sindex);//写入栈 0 0 ( 1 1 [
                        zindex++;//2
                        sindex++;//2
                    }
                }else {//2 2 )
                    if(zindex>0){
                        if (match(zhan[zindex-1],s.charAt(sindex))){//与栈前一个存的相同 [
                            sindex++;
                            zindex--;
                            zhan[zindex]=' ';//出栈
                        }else {
                            return false;
                        }
                    }else {
                        return false;
                    }
                }
            }
            //遍历完且栈为空
            return zindex == 0;

        }
    }
}
