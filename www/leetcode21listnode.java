package com.leecode.www;

import java.util.Scanner;

public class leetcode21listnode {
    //将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    //示例 1：
    //输入：l1 = [1,2,4], l2 = [1,3,4]
    //输出：[1,1,2,3,4,4]
    //示例 2：
    //输入：l1 = [], l2 = []
    //输出：[]
    //示例 3：
    //输入：l1 = [], l2 = [0]
    //输出：[0]
    public static class ListNode {
        int val;//节点
        ListNode next;//指针
        ListNode(int val) {
            this.val = val;
        }//构造
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }//构造
    }
    public static void main(String[] args) {
//        int nums1[]= {1,2,4};
//        int nums2[]= {1,3,4};
        //初始化链表
        ListNode nodeHead = new ListNode(0);//头节点
        ListNode nextNode;
        nextNode=nodeHead;//定义移动指针
    }

    public static class Solution {
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            return list1;

        }
    }
}
