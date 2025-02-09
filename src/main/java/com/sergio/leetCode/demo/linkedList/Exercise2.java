package com.sergio.leetCode.demo.linkedList;

public class Exercise2 {
	
	public static class ListNode {
		int val;
		ListNode next;
		
		ListNode() {
			
		}
		
		ListNode(int val) { 
			this.val = val; 
		}
		
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	 }
	
	public ListNode reverseBetween(ListNode head, int left, int right) { // ([1,2,3,4,5], 2, 4)
       
		if (head == null || left == right) {
			return head;
		}
		
		// Para satisfecer los casos en que left sea 1 hacemos:
		
		ListNode dummy = new ListNode(0);
		
		dummy.next = head;
		
		ListNode prev = dummy;
		for (int i = 1; i < left; i++) {
			prev = prev.next;
		}
		
		ListNode start = prev.next; // Nodo donde empieza la reversion
		ListNode then = start.next; // Nodo que sera movido al frente
		
		for (int i = 0; i < right - left; i++) {
			start.next = then.next; //	Conectar 2 con 4			Conectar 2 con 5
			then.next = prev.next; 	// 	Apuntar 3 a 2				Apuntar 4 a 3
			prev.next = then; 		// 	Apuntar 1 a 3				Apuntar 1 a 4
			then = start.next; 		// 	Mover then a 4				Mover then a 5
		}
		
		return dummy.next;
		
    }
	
	public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
	
	public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Lista original:");
        printList(head);

        Exercise2 solution = new Exercise2();
        head = solution.reverseBetween(head, 2, 4);

        System.out.println("Lista después de invertir de 2 a 4:");
        printList(head);
    }

}
