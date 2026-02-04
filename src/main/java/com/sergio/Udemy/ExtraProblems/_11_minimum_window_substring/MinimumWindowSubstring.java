package com.sergio.Udemy.ExtraProblems._11_minimum_window_substring;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

  public String minWindow(String s, String t) {

    if (s.length() < t.length()) return "";

    Map<Character, Integer> need = new HashMap<>();
    for (char c : t.toCharArray()) {
      need.put(c, need.getOrDefault(c, 0) + 1);
    }

    int required = need.size();

    Map<Character, Integer> window = new HashMap<>();
    int left = 0;
    int right = 0;
    int formed = 0;

    int[] ans = {Integer.MIN_VALUE, 0, 0};

    while (right < s.length()) {
      char c = s.charAt(right);
      window.put(c, window.getOrDefault(c, 0) + 1);

      if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) formed++;

      while (left <= right && formed == required) {
        if (ans[0] == Integer.MIN_VALUE || right - left + 1 < ans[0]) {
          ans[0] = right - left + 1;
          ans[1] = left;
          ans[2] = right;
        }

        char leftChar = s.charAt(left);
        window.put(leftChar, window.get(leftChar) - 1);

        if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) formed--;
        left++;
      }
      right++;
    }
    return ans[0] == Integer.MIN_VALUE ? "" : s.substring(ans[1], ans[2] + 1);
  }
}
