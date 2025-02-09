package com.sergio.leetCode.demo.fastSlowPointers;

public class Exercise2_way1 {
	
	public static boolean isHappy(int n) {
		
		int slow = n;
		int fast = n;
		
		do {
			
			slow = sumOfSquares(slow);
			fast = sumOfSquares(sumOfSquares(fast));
			
		} while (slow != fast);
		
		return slow == 1;
	}
	
	private static int sumOfSquares(int n) {
		
		int sum = 0;
		
		while (n > 0) {
			int digit = n % 10; // 19 -> 19 % 10 = 9 -> Obtenemos el ultimo digito
			sum += digit * digit; // Elevamos al cuadrado el ultimo digito, utilizando la suma acumulativa para guardar valores proximos
			n = n / 10; // Utilizamos la division entera, dividimos el numero entre 10 para obtener el digito o digitos anteriores -> 19 / 10 = 1
		}
		return sum;
	}
	
	public static void main(String[] args) {
        int n = 19;
        System.out.println("¿Es feliz? " + isHappy(n)); // Output: true
    }

}
