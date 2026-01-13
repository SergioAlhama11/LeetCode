package com.sergio.Udemy.Heaps._02_top_k_frequent_elements;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopKFrequentTest {

    @Test
    public void topKFrequentTest() {
        TopKFrequent topKFrequent = new TopKFrequent();

        int[] firstResult = topKFrequent.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2);
        Arrays.sort(firstResult);
        assertArrayEquals(new int[] {1, 2}, firstResult);
        assertArrayEquals(new int[] {3}, topKFrequent.topKFrequent(new int[] {1, 1, 2, 3, 3, 3}, 1));
    }
}
