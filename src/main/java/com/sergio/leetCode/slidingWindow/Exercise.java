package com.sergio.leetCode.slidingWindow;

import java.util.HashMap;

public class Exercise {
	
	public static String minWindow(String s, String t) {
		
		if (s.length() < t.length()) {
			return "";
		}
		
		// Crear un mapa con los caracteres de t y su frecuencia
		HashMap<Character, Integer> mapT = new HashMap<>(); 
		
		for (char c : t.toCharArray()) {
			mapT.put(c, mapT.getOrDefault(c, 0) + 1);
		}
		
		// Variables de la ventana deslizante
		int left = 0;
		int minLeft = 0;
		int ventanaMinima = Integer.MAX_VALUE;
		int count = 0; // Numero de caracteres coincidentes
		
		HashMap<Character, Integer> window = new HashMap<>();
		
		// Expandimos la ventana con right
		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			window.put(c, window.getOrDefault(c, 0) + 1);
			
			// Si c está en t y no hemos excedido su frecuencia requerida
			if (mapT.containsKey(c) && window.get(c) <= mapT.get(c)) {
				count++; // Aumentamos el conteo de caracteres válidos
			}
			
			// Intentamos reducir la ventana cuando contiene todos los caracteres de t
			while (count == t.length()) {
				if (right - left + 1 < ventanaMinima) { // Actualizar la ventana minima si encontramos una menor
					ventanaMinima = right - left + 1;
					minLeft = left;
				}
				
				// Borramos el caracter de la izquierda y ajustamos la ventana
				char leftChar = s.charAt(left);
				window.put(leftChar, window.get(leftChar) - 1);
				
				// Si leftChar estaba en t y ahora es insuficiente en la ventana, reducimos count
				if (mapT.containsKey(leftChar) && window.get(leftChar) < mapT.get(leftChar)) {
					count--;
				}
				
				left++; // Movemos a la derecha para intentar reducir la ventana
			}
		}
		
		// Si ventanaMinima no cambio, significa que no encontramos una ventana valida
		return ventanaMinima == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + ventanaMinima);
		
	}
	
	public static void main(String[] args) {
		String s = "ADOBECODEBAN";
		String t = "ABC";
		System.out.println("Mínima ventana que contiene '" + t + "': " + minWindow(s, t));
	}
}
