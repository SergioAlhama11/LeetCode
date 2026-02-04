package com.sergio.Udemy.ExtraProblems._11_minimum_window_substring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinimumWindowSubstringTest {

  @Test
  public void minimumWindowSubstringTest() {
    MinimumWindowSubstring m = new MinimumWindowSubstring();
    String s = "ADOBECODEBANC";
    String t = "ABC";

    assertEquals("BANC", m.minWindow(s, t));
  }

  @Test
  public void minimumWindowSubstringTest2() {
    MinimumWindowSubstring m = new MinimumWindowSubstring();
    String s = "a";
    String t = "a";

    assertEquals("a", m.minWindow(s, t));
  }

  @Test
  public void minimumWindowSubstringTest3() {
    MinimumWindowSubstring m = new MinimumWindowSubstring();
    String s = "a";
    String t = "aa";

    assertEquals("", m.minWindow(s, t));
  }
}
