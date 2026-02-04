package com.sergio.Udemy.ExtraProblems._10_group_anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class GroupAnagramsTest {

  @Test
  public void groupAnagrams1Test() {
    GroupAnagrams g = new GroupAnagrams();
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

    List<List<String>> expected = Arrays.asList(
        Arrays.asList("eat", "tea", "ate"),
        Arrays.asList("tan", "nat"), List.of("bat")
    );

    assertEquals(expected, g.groupAnagrams1(strs));
  }

  @Test
  public void groupAnagrams2Test() {
    GroupAnagrams g = new GroupAnagrams();
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

    List<List<String>> expected = Arrays.asList(
        Arrays.asList("eat", "tea", "ate"),
        Arrays.asList("tan", "nat"), List.of("bat")
    );

    assertEquals(expected, g.groupAnagrams2(strs));
  }
}
