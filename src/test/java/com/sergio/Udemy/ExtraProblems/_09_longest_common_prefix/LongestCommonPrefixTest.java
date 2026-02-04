package com.sergio.Udemy.ExtraProblems._09_longest_common_prefix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

  @Test
  public void longestCommonPrefix_HorizontalScanTest() {
    LongestCommonPrefix l = new LongestCommonPrefix();
    String[] strs = {"flower", "flow", "flight"};

    assertEquals("fl", l.longestCommonPrefix_HorizontalScan(strs));
  }

  @Test
  public void longestCommonPrefix_VerticalScanTest() {
    LongestCommonPrefix l = new LongestCommonPrefix();
    String[] strs = {"flower", "flow", "flight"};

    assertEquals("fl", l.longestCommonPrefix_VerticalScan(strs));
  }

  @Test
  public void longestCommonPrefixSortingTrickTest() {
    LongestCommonPrefix l = new LongestCommonPrefix();
    String[] strs = {"flower", "flow", "flight"};

    assertEquals("fl", l.longestCommonPrefixSortingTrick(strs));
  }
}
