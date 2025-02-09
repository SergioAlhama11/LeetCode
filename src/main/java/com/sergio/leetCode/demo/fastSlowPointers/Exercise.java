package com.sergio.leetCode.demo.fastSlowPointers;

public class Exercise {
	
	// Floyd's Cycle Detection Algorithm (Fast & Slow Pointers)
	
	/*
	 * Usamos 2 punteros:
	 * 
	 * 	- Puntero lento -> Se mueve de uno en uno.
	 * 	- Puntero rapido -> Se mueve de dos en dos.
	 * 
	 * 	Si hay un ciclo en la lista, eventualmente fast alcanzará a slow dentro del ciclo.
	 *	Si no hay ciclo, fast llegará a null al final de la lista.
	 * 
	 */
	
	class ListNode {
		int val;
		ListNode next;
		
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	 
	
	public boolean hasCycle(ListNode head) {
		
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			
			fast = fast.next.next;
			slow = slow.next;
			
			if (fast == slow) {
				return true;
			}
		}
		
		return false;
		
    }

}
