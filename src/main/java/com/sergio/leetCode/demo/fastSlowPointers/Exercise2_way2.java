package com.sergio.leetCode.demo.fastSlowPointers;

import java.util.HashSet;

public class Exercise2_way2 {
	
	private static boolean isHappy(int n) {
		
		HashSet<Integer> seen = new HashSet<>();
		
		while (n != 1 && !seen.contains(n)) {
			seen.add(n);
			n = sumOfSquares(n);
		}
		
		return n == 1;
	}
	
	
	private static int sumOfSquares(int n) {
		
		int sum = 0;
		
		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n = n / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
        int n = 19;
        System.out.println("¿Es feliz? " + isHappy(n)); // Output: true
    }
}
