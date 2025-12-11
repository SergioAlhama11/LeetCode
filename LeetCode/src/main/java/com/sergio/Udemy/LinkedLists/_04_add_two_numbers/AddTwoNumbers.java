package com.sergio.Udemy.LinkedLists._04_add_two_numbers;

import com.sergio.Udemy.LinkedLists._00_linkedList.Node;

/**
 * Escribe un algoritmo que realice la suma de dos listas que representan dos enteros positivos.
 * Las listas estan en posicion invertida.
 *
 * Ejemplo:
 *  Input: 1 -> 2 -> 4 || 5 -> 2 -> 8
 *  Output: 6 -> 4 -> 2 -> 1
 *  421 + 825 = 1246
 */
public class AddTwoNumbers {
    public Node addTwoNumbers(Node list1, Node list2) {
        Node result = new Node(Integer.MIN_VALUE);
        Node current = result;
        int acarreo = 0;

        while (list1 != null || list2 != null) {
            current.next = new Node(-1);
            current = current.next;
            int digit = acarreo;
            if (list1 != null) {
                digit += list1.value;
                list1 = list1.next;
            }

            if (list2 != null) {
                digit += list2.value;
                list2 = list2.next;
            }

            acarreo = digit / 10;
            digit = digit % 10;

            current.value = digit;
        }

        if (acarreo > 0) {
            current.next = new Node(acarreo);
        }

        return result.next;
    }
}
