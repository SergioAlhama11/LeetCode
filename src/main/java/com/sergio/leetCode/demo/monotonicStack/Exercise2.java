package com.sergio.leetCode.demo.monotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class Exercise2 {
	
	public static int[] dailyTemperatures(int[] temperatures) { // [73,74,75,71,69,72,76,73]
		
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[temperatures.length];
		
        for (int i = 0; i < temperatures.length; i++) {
        	
        	while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        		int prevIndex = stack.pop();
        		result[prevIndex] = i - prevIndex;
        	}
        	
        	stack.push(i);
        	
        }
		
        return result;
		
    }
	
	public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = Exercise2.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result)); // [1, 1, 4, 2, 1, 1, 0, 0]
    }

}
