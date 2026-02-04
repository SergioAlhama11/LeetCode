package com.sergio.Udemy.ExtraProblems._12_valid_palindrome;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;

            right--;
            left++;
        }

        return true;
    }
}
