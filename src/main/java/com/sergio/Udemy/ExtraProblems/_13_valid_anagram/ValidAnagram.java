package com.sergio.Udemy.ExtraProblems._13_valid_anagram;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char [] charS = s.toCharArray();
        char [] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);

        return Arrays.equals(charS, charT);
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
