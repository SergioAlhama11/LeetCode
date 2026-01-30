package com.sergio.Udemy.ExtraProblems._04_longest_unique_substring;

import java.util.HashSet;
import java.util.Set;

/*
 * Dada una string, devuelve la longitud de la substring más larga
 * en la que no se repiten caracteres
 *
 * Ejemplo 1:
 *  Input: aabcdefed
 *  Output: 6 (abcdef)
 *
 * Ejemplo 2:
 *  Input: ccccc
 *  Output: 1 (c)
 */
public class LongestUniqueSubstring {

  public int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int left = 0;
    int maxLength = 0;

    for (int right = 0; right < s.length(); right++) {
      while(set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
      }
      set.add(s.charAt(right));
      maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
  }
}
