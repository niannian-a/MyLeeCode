package com.leecode.www.Hot100;

import java.util.*;

public class Leetcode49groupAnagrams {
    /*给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
    示例 1:
    输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
    解释：
    在 strs 中没有字符串可以通过重新排列来形成 "bat"。
    字符串 "nat" 和 "tan" 是字母异位词，因为它们可以重新排列以形成彼此。
    字符串 "ate" ，"eat" 和 "tea" 是字母异位词，因为它们可以重新排列以形成彼此。
    示例 2:
    输入: strs = [""]
    输出: [[""]]
    示例 3:
    输入: strs = ["a"]
    输出: [["a"]]*/
    public static void main(String[] args) {
        String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list=Solution.groupAnagrams(strs);
        System.out.println(list);
    }
    public static class Solution {
        public static List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                //判断是否包含异构单词
                /*{aet=[]}//eat不包含，所以put
                {aet=[eat]}
                {aet=[eat, tea]}
                {aet=[eat, tea], ant=[]}
                {aet=[eat, tea], ant=[tan]}
                {aet=[eat, tea, ate], ant=[tan]}
                {aet=[eat, tea, ate], ant=[tan, nat]}
                {aet=[eat, tea, ate], abt=[], ant=[tan, nat]}
                {aet=[eat, tea, ate], abt=[bat], ant=[tan, nat]}*/
                if (!map.containsKey(key)) {
                    //不包含异构单词
                    //使用排序后的单词，如ant作为key，新建arraylist作为value
                    map.put(key, new ArrayList<>());
//                    System.out.println(map);
                }//包含异构单词，把排序前单词strs[i]加入
                map.get(key).add(str);
//                System.out.println(map);
            }
            return new ArrayList<>(map.values());
        }


    }
}
