package com.sergio.leetCode.slidingWindow;

public class SlidingWindowExample2 {
	
	// Ventana Dinamica (minimo subarray con suma >= X)
	
	public static int minSubarrayLength(int[] arr, int x) {
		
		int left = 0;
		int sum = 0;
		int minLength = Integer.MAX_VALUE;
		
		for (int right = 0; right < arr.length; right++) {
			sum += arr[right];
			
			while (sum >= x) {
				minLength = Math.min(minLength, right - left + 1);
				sum -= arr[left++];
			}
		}
		
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
        
    }
	
	
	public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int x = 7;
        System.out.println("Longitud mínima del subarray: " + minSubarrayLength(arr, x));
    }

}
