package com.sergio.Udemy.LinkedLists._04_add_two_numbers;

import com.sergio.Udemy.LinkedLists._00_linkedList.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {

    @Test
    void addTwoNumbersTest() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        //list1.next.next.next = new Node(6);

        Node list2 = new Node(5);
        list2.next = new Node(2);
        list2.next.next = new Node(8);

        Node result = addTwoNumbers.addTwoNumbers(list1, list2);

        assertEquals(6, result.value);
        assertEquals(4, result.next.value);
        assertEquals(2, result.next.next.value);
        assertEquals(1, result.next.next.next.value);
    }
}
