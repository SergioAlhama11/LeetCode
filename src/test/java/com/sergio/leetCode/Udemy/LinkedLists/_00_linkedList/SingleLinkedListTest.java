package com.sergio.leetCode.Udemy.LinkedLists._00_linkedList;

public class SingleLinkedListTest {

  @Test
  public void test() {
    SingleLinkedList list = new SingleLinkedList();
    list.print();
    list.appendToTail(1);
    list.appendToTail(2);
    list.appendToTail(3);
    list.print();
    list.appendToTail(4);
    list.appendToTail(5);
    list.print();
    list.deleteNode(1);
    list.print();

    list.deleteNode(3);
    list.print();

    list.deleteNode(5);
    list.print();
  }
}
