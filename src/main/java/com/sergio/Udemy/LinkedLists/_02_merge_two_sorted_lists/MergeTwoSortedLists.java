package com.sergio.Udemy.LinkedLists._02_merge_two_sorted_lists;

import com.sergio.Udemy.LinkedLists._00_linkedList.Node;

/**
 * Escribe un algoritmo para combinar dos listas enlazadas simples ordenadas.
 * El resultado debe ser una unica lista enlazada ordenada. Devuelve su head.
 *
 * Ejemplo:
 *  Input: 1 -> 2 -> 4 -> 6, 2 -> 3 -> 5
 *  Output: 1 -> 2 -> 2 -> 3 -> 4 -> 5 -> 6
 */
public class MergeTwoSortedLists {
    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(Integer.MIN_VALUE);
        Node current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 == null) {
            appendList(current, list2);
        } else {
            appendList(current, list1);
        }

        return dummy.next;
    }

    private void appendList(Node current, Node list) {
        while (list != null) {
            current.next = list;
            list = list.next;
            current = current.next;
        }
    }
}
