package com.sergio.leetCode.twoPointers;

import java.util.Arrays;

public class TwoPointersExample3 {
	
	// Dos punteros para invertir un array
	
	public static void reverse(int[] arr) {
		
		int left = 0;
		int right = arr.length - 1;
		
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
	}
	
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr)); // [5, 4, 3, 2, 1]
    }

}
