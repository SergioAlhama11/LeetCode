package com.sergio.leetCode.twoPointers;

import java.util.Arrays;

public class Exercise1 {
	
	public static int[] twoSum(int[] numbers, int target) {
		
		int left = 0;
		int right = numbers.length - 1;
		
		while (left < right) {
			
			int total = numbers[left] + numbers[right];
			
			if (total == target) {
				return new int[]{left+1, right+1};
			} else if (total < target) {
				left++;
			} else {
				right--;
			}
			
		}
		
		return new int[] {-1, -1};
		
	}
	
	public static void main(String args[]) {
		int[] num = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(num, 9)));
	}

}
