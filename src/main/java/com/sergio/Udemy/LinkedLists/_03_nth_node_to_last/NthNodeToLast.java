package com.sergio.Udemy.LinkedLists._03_nth_node_to_last;

import com.sergio.Udemy.LinkedLists._00_linkedList.Node;

/**
 * Dada una lista enlazada simple y un valor N, devuelve el nodo N empezando por el final
 *
 * Ejemplo:
 *  Input: 1 -> 2 -> 4 -> 6 -> NULL|| n: 1
 *  Output: 4
 */
public class NthNodeToLast {

    // Utilizando dos punteros, si primero avanzamos n posiciones el primero, y a continuacion
    // avanzamos ambos al mismo ritmo, cuando el primero llegue al final de la lista, el segundo
    // estara en la posicion deseada.
    public Node nthNodeToLast(Node head, int n) {
        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < n; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}
