package com.sergio.Udemy.ExtraProblems._10_group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  // Time complexity: O(m * n)
  // Space complexity: O(mn)
  public List<List<String>> groupAnagrams1(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      int[] count = new int[26];
      for (char c : str.toCharArray()) {
        count[c - 'a']++;
      }

      StringBuilder sb = new StringBuilder();

      for (int num : count) {
        sb.append(num).append('#');
      }

      String key = sb.toString();

      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }

      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
  }

  // Time complexity: O(m * nlogn)
  // Space complexity: O(mn)
  public List<List<String>> groupAnagrams2(String[] strs) {

    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);

      String key = new String(chars);
      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
  }
}
