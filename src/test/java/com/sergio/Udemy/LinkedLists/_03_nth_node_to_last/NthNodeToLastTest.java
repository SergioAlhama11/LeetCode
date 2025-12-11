package com.sergio.Udemy.LinkedLists._03_nth_node_to_last;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.sergio.Udemy.LinkedLists._00_linkedList.Node;
import org.junit.jupiter.api.Test;

public class NthNodeToLastTest {

  @Test
  void nthNodeToLastTest() {
    NthNodeToLast nthNode = new NthNodeToLast();
    Node list = new Node(1);
    list.next = new Node(2);
    list.next.next = new Node(4);
    list.next.next.next = new Node(6);

    assertEquals(6, nthNode.nthNodeToLast(list, 1).value);
    assertEquals(4, nthNode.nthNodeToLast(list, 2).value);
    assertEquals(2, nthNode.nthNodeToLast(list, 3).value);
    assertEquals(1, nthNode.nthNodeToLast(list, 4).value);
    assertNull(nthNode.nthNodeToLast(list, 5));
  }
}
