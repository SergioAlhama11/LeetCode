package com.sergio.leetCode.demo.monotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElement {
	
	// Dado nums = [2, 1, 5, 3, 6, 4, 8], queremos encontrar el anterior menor elemento para cada índice.
	
	 public static int[] previousSmallerElements(int[] nums) {
		 
		 Stack<Integer> stack = new Stack<>();
		 
		 int lenght = nums.length;
		 int[] result = new int[lenght];
		 
		 Arrays.fill(result, -1);
		 
		 for (int i = 0; i < lenght; i++) {
			 
			 while (!stack.isEmpty() && stack.peek() >= nums[i]) {
				 stack.pop();
			 }
			 
			 if (!stack.isEmpty()) {
				 result[i] = stack.peek();
			 }
			 
			 stack.push(nums[i]);
			 
		 }
		 
		 return result;
		 
	 }
	 
	 public static void main(String[] args) {
		 int[] nums = {2, 1, 5, 3, 6, 4, 8};
		 int[] result = previousSmallerElements(nums);
		 System.out.println(Arrays.toString(result)); // [-1, -1, 1, 1, 3, 3, 4]
	    }

}
