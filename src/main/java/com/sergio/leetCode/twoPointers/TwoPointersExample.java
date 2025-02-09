package com.sergio.leetCode.twoPointers;

import java.util.Arrays;

public class TwoPointersExample {
	
	// Dos Punteros en direcciones opuestas (Inicio y Fin)
	
	public static boolean hasPairWithSum(int[] arr, int target) {
		
		Arrays.sort(arr);
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			int sum = arr[left] + arr[right];
			
			if (sum == target) {
				return true;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		int[] nums = {2, 7, 11, 15, 1, 8}; // [1, 2, 7, 8, 11, 15]
        int target = 9;
        System.out.println(hasPairWithSum(nums, target)); // true (1 + 8 o 2 + 7)
	}

}
