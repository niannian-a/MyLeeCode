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
        String a="110";
        String b="111";
        String c=Solution.addBinary(a,b);
        System.out.println(c);

    }

    public static class Solution {
        public static String addBinary(String a, String b) {//111 1
            int al=a.length()-1;//a最后一位
            int bl=b.length()-1;//b最后一位
            int s=0;//进位数
            String result= "";
            //补0
            if(al>bl){
                int d=al-bl;//差的位数
                for(;d>0;d--){
                    b="0"+b;
                    bl++;
                    System.out.println(b);
                }
            }else if(bl>al){
                int d=bl-al;//差的位数
                for(;d>0;d--){
                    a="0"+a;
                    al++;
                    System.out.println(a);
                }
            }
            while(al>=0||bl>=0){
                int anum=a.charAt(al)-48;
                int bnum=b.charAt(bl)-48;
                int k=s+anum+bnum;
                if(k>=2){//1+1+1/1+1+0   1+1=2
                    int by=k-2;//进位后位数 1/0
                    result= by+result;//""+"0"="0"
                    s=1;
                    al--;
                    bl--;
                }else {//0+1+0/1+0+0/0+0+0 s=0不进位 1+0+1
                    int by=k;//
                    result=by+result;//"1"+"1"="11"
                    s=0;
                    al--;
                    bl--;
                }
            }
            if(s!=0){
                return result=s+result;
            }else return result;

        }
    }
}
