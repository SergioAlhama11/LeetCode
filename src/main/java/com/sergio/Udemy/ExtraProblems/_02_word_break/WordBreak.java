package com.sergio.Udemy.ExtraProblems._02_word_break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Dada una string s y un diccionario de palabras wordDict, devuelve si s puede ser dividida usando
 * solamente palabras de wordDict.
 *
 * Ejemplo 1:
 *  Input:
 *    s: "applepenapple"
 *    wordDict: ["apple","pen"]
 *
 *  Output: true
 *
 * Ejemplo 2:
 *  Input:
 *    s: "catsandog"
 *    wordDict: ["cats","dog","sand","and","cat"]
 *
 *  Output: false
 */
public class WordBreak {

  public boolean wordBreak(String s, List<String> wordDict) {
    return wordBreakHelper(s, new HashSet<>(wordDict), new boolean[s.length() + 1]);
  }

  private boolean wordBreakHelper(String s, Set<String> wordDict, boolean[] memo) {
    if (memo[s.length()]) return false;

    for (int i = 1; i <= s.length(); i++) {
      String firstWord = s.substring(0, i);

      if (wordDict.contains(firstWord)) {
        String secondWord = s.substring(i, s.length());

        if (secondWord.isEmpty()
            || wordDict.contains(secondWord)
            || wordBreakHelper(secondWord, wordDict, memo)) return true;
      }
    }

    memo[s.length()] = true;
    return false;
  }

  // applepenapple
  // catsandog || ["cats","dog","sand","and","cat"]
  public boolean wordBreakDP(String s, List<String> wordDict) {
    Set<String> dict = new HashSet<>(wordDict);
    boolean[] dp =  new boolean[s.length() + 1];

    dp[0] = true; // String vacia

    for (int i = 1; i <= s.length(); i++) {
      for (int j = 0; j < i; j++) {
        if (dp[j] && dict.contains(s.substring(j, i))) {
          dp[i] = true;
          break;
        }
      }
    }
    return dp[s.length()];
  }
}
