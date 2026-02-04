package com.sergio.Udemy.ExtraProblems._13_valid_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {

    @Test
    public void validAnagram1Test() {
        ValidAnagram v = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";

        assertTrue(v.isAnagram(s, t));
    }

    @Test
    public void validAnagram1Test2() {
        ValidAnagram v = new ValidAnagram();
        String s = "rat";
        String t = "car";

        assertFalse(v.isAnagram(s, t));
    }

    @Test
    public void validAnagram2Test() {
        ValidAnagram v = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";

        assertTrue(v.isAnagram2(s, t));
    }

    @Test
    public void validAnagram2Test2() {
        ValidAnagram v = new ValidAnagram();
        String s = "rat";
        String t = "car";

        assertFalse(v.isAnagram2(s, t));
    }
}
