package com.sergio.Udemy.ExtraProblems._01_merge_k_sorted_lists;

/*
 * Dado un array de listas enlazadas, cada una de ellas ordenada de forma ascendente,
 * combínalas para devolver una única lista enlazada ordenada.
 *
 * Nota: No está permitido almacenar todos los valores de los nodos para ordenarlos de forma
 * separada y crear una nueva lista enlazada a partir de ese resultado.
 *
 * Ejemplo:
 *  Input:
 *    [
 *       1->4->5,
 *       1->3->4,
 *       2->6
 *    ]
 *   Output:
 *     1->1->2->3->4->4->5->6
 */
public class MergeKSortedLists {

  public class Node {
    public Node next;
    public int value;

    public Node(int value) {
      this.value = value;
    }
  }

  public Node mergeKLists(Node[] lists) {
    int offSet = 1;

    while (offSet < lists.length) {
      for (int i = 0; (i + offSet) < lists.length; i += offSet * 2) {
        lists[i] = mergeTwoLists(lists[i], lists[i + offSet]);
      }

      offSet *= 2;
    }
    return lists[0];
  }


  /**
   * 1 -> 4 -> 5
   * 1 -> 3 -> 4
   * -------
   * 1 -> 1 -> 3 -> 4 -> 4 -> 5
   */
  private Node mergeTwoLists(Node list1, Node list2) {

    Node dummy = new Node(Integer.MIN_VALUE);
    Node current = dummy;

    while (list1 != null && list2 != null) {
      if (list1.value < list2.value) {
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
