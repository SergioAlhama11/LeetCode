package com.sergio.Udemy.LinkedLists._01_remove_dups;

import com.sergio.Udemy.LinkedLists._00_linkedList.Node;

import java.util.HashSet;

/**
 * Escribe un algoritmo para eliminar los elementos duplicados en una Lista enlazada
 *
 * Ejemplo:
 *  Input: 1 -> 2 -> 2 -> 3 -> 4 -> 1
 *  Output: 1 -> 2 -> 3 -> 4
 */
public class RemoveDups {

    public void removeDups(Node head) {
        HashSet<Integer> found = new HashSet<>();
        found.add(head.value);

        Node current = head;
        while (current != null && current.next != null) {
            if (!found.add(current.next.value)) {
                // Si no podemos añadir el siguiente elemento es porque ya existe, por lo que debemos eliminarlo
                current.next = current.next.next;
            }
            // Avanzamos el puntero
            current = current.next;
        }
    }
}
