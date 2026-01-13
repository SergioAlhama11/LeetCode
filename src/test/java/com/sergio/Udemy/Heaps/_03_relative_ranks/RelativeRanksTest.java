package com.sergio.Udemy.Heaps._03_relative_ranks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RelativeRanksTest {

    @Test
    public void relativeRanksTest() {
        RelativeRanks relativeRanks = new RelativeRanks();

        int[] scores = new int[] {10, 3, 8, 9, 4};
        String[] result = new String[] {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        assertArrayEquals(result, relativeRanks.findRelativeRanks(scores));
    }
}
