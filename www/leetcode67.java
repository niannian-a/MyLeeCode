package com.leecode.www;

public class leetcode67 {
    //给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
    //示例 1：
    //输入:a = "11", b = "1"
    //输出："100"
    //示例 2：
    //输入：a = "1010", b = "1011"
    //输出："10101"
    //提示：
    //1 <= a.length, b.length <= 104
    //a 和 b 仅由字符 '0' 或 '1' 组成
    //字符串如果不是 "0" ，就不含前导零
    public static void main(String[] args) {
        String a="111";
        String b="101";
        String c=Solution.addBinary(a,b);
        System.out.println(c);

    }

    public static class Solution {
        public static int BioToTen(String a){
            int TenA=0;
            for(int i=a.length()-1;i<0;i--){
                TenA+= Math.pow()
            }
        }
        public static String addBinary(String a, String b) {//111 1
//            //末尾相加 判断进位与否
//            int ap=a.length()-1;
//            int bp=b.length()-1;//最后一位开始
//            int s=0;
//            String c="";
//            while(ap>=0||bp>=0){
//                if(ap==0){//ap到首位
//                    if(a.charAt(ap)+b.charAt(bp)+s>=2){//1+1进位
//                        c="0"+c;
//                        //ap--;
//                        a="0";
//                        bp--;
//                        s=1;//进位+1
//                    }else {// 0+1 0+0 1+0 不进位
//                        c= String.valueOf(a.charAt(ap)+b.charAt(bp)+s)+c;
//                        //ap--;
//                        a="0";
//                        bp--;
//                        s=0;
//                    }
//                }else if(bp==0){
//                    if(a.charAt(ap)+b.charAt(bp)+s>=2){//1+1进位
//                        c="0"+c;
//                        ap--;
//                        b="0";
//                        //bp--;
//                        s=1;//进位+1
//                    }else {// 0+1 0+0 1+0 不进位
//                        c= String.valueOf(a.charAt(ap)+b.charAt(bp)+s)+c;
//                        //ap--;
//                        b="0";
//                        //bp--;
//                        s=0;
//                    }
//                }else {
//                    //都不为首位
//                    if(a.charAt(ap)+b.charAt(bp)+s>=2){//1+1进位
//                        c="0"+c;
//                        ap--;
//                        bp--;
//                        s=1;//进位+1
//                    }else {// 0+1 0+0 1+0 不进位
//                        c= String.valueOf(a.charAt(ap)+b.charAt(bp)+s)+c;
//                        ap--;
//                        bp--;
//                        s=0;
//                    }
//                }
//            }
//            return c;
            //转十进制再加，再转二进制

        }
    }
}
