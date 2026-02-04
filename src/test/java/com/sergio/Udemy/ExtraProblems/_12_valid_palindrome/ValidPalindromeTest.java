package com.sergio.Udemy.ExtraProblems._12_valid_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {

    @Test
    public void validPalindromeTest() {
        ValidPalindrome v = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";

        assertTrue(v.isPalindrome(s));
    }

    @Test
    public void validPalindromeTest2() {
        ValidPalindrome v = new ValidPalindrome();
        String s = "race a car";

        assertFalse(v.isPalindrome(s));
    }
}
