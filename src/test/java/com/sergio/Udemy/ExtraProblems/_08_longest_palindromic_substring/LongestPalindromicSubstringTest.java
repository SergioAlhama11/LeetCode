package com.sergio.Udemy.ExtraProblems._08_longest_palindromic_substring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {

  @Test
  public void longestPalindromicSubstringTest() {
    LongestPalindromicSubstring l = new LongestPalindromicSubstring();

    assertEquals("racecar", l.longestPalindrome("racecar"));
  }
}
