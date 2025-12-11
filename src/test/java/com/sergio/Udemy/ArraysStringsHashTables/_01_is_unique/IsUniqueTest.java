package com.sergio.Udemy.ArraysStringsHashTables._01_is_unique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsUniqueTest {

    @Test
    void isUnique() {
        IsUnique isUnique = new IsUnique();
        assertTrue(isUnique.isUnique("abcde"));
        assertTrue(isUnique.isUnique("aAbBcCdDeE"));
        assertFalse(isUnique.isUnique("abcded"));
    }
}
