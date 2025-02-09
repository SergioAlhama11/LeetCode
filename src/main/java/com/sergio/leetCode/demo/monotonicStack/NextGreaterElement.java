package com.sergio.leetCode.demo.monotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	
	// Dado un array nums = [2, 1, 5, 3, 6, 4, 8], queremos encontrar el siguiente mayor elemento para cada índice.
	
	public static int[] nextGreaterElements(int[] nums) {
		int length = nums.length;
        int[] result = new int[length];
        
        Arrays.fill(result, -1); // Inicialmente, asumimos que no hay mayor siguiente
        
        Stack<Integer> stack = new Stack<>(); // Pila almacena índices
        
        for (int i = 0; i < length; i++) {
        	while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
        		result[stack.pop()] = nums[i];
        	}
        	stack.push(i);
        }
        
        return result;
	}
	
	
	public static void main(String[] args) {
        int[] nums = {2, 1, 5, 3, 6, 4, 8};
        int[] result = nextGreaterElements(nums);
        System.out.println(Arrays.toString(result)); // [5, 5, 6, 6, 8, 8, -1]
    }
}
