package com.sergio.leetCode.demo.monotonicStack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Exercise1 {
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		
		Map<Integer, Integer> nextGreaterMap = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		
		for (int n : nums2) {
			while (!stack.isEmpty() && n > stack.peek()) {
				nextGreaterMap.put(stack.pop(), n);
			}
			
			stack.push(n);
		}
		
		int[] result = new int[nums1.length];
		
		for (int i = 0; i < nums1.length; i++) {
			result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
		}
		
		return result;
        
    }
	
	public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result)); // [-1, 3, -1]

        int[] nums1b = {2, 4};
        int[] nums2b = {1, 2, 3, 4};
        
        int[] result2 = nextGreaterElement(nums1b, nums2b);
        System.out.println(Arrays.toString(result2)); // [3, -1]
    }

}
