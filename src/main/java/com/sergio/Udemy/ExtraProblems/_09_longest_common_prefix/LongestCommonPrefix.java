package com.sergio.Udemy.ExtraProblems._09_longest_common_prefix;

import java.util.Arrays;

public class LongestCommonPrefix {

  public String longestCommonPrefix_HorizontalScan(String[] strs) {

    if (strs == null || strs.length == 0) return "";

    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
      while (!strs[i].startsWith(prefix)) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) return "";
      }
    }
    return prefix;
  }

  public String longestCommonPrefix_VerticalScan(String[] strs) {

    if (strs == null || strs.length == 0) return "";

    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (i >= strs[j].length() || strs[j].charAt(i) != c) {
          return strs[0].substring(0, i);
        }
      }
    }
    return strs[0];
  }

  public String longestCommonPrefixSortingTrick(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    Arrays.sort(strs);
    String first = strs[0];
    String last = strs[strs.length - 1];

    int i = 0;

    while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
      i++;
    }

    return first.substring(0, i);
  }
}
