package com.sergio.leetCode.slidingWindow;

public class SlidingWindowExample {
	
	// Ventana Fija

	public static int maxSumSubarray(int[] arr, int k) {
		
		int maxSum = 0;
		int windowSum = 0;
		
		// Sumar los primeros k elementos (inicializar la ventana)
		for (int i = 0; i < k; i++) {
			windowSum = windowSum + arr[i];
		}
		
		maxSum = windowSum; // Para {2, 1, 5, 1, 3, 2} -> windowSum = 8 | maxSum = 8
		
		// Desalizar la ventana
		for (int i = k; i < arr.length; i++) {
			windowSum = windowSum + arr[i] - arr[i - k]; // Agregar nuevo elemento y remover el antiguo
			maxSum = Math.max(maxSum, windowSum);
		}
		
		return maxSum;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Suma máxima de " + k + " elementos consecutivos: " + maxSumSubarray(arr, k));
	}
	
}