package com.sergio.Udemy.ExtraProblems._01_merge_k_sorted_lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MergeKSortedListsTest {

  @Test
  public void mergeKSortedListsTest() {
    MergeKSortedLists mergeLists = new MergeKSortedLists();

    MergeKSortedLists.Node l1 = mergeLists.new Node(1);
    l1.next = mergeLists.new Node(4);
    l1.next.next = mergeLists.new Node(5);

    MergeKSortedLists.Node l2 = mergeLists.new Node(1);
    l2.next = mergeLists.new Node(3);
    l2.next.next = mergeLists.new Node(4);

    MergeKSortedLists.Node l3 = mergeLists.new Node(2);
    l3.next = mergeLists.new Node(6);

    MergeKSortedLists.Node mergedList =
        mergeLists.mergeKLists(new MergeKSortedLists.Node[] {l1, l2, l3});

    assertEquals(mergedList.value, 1);
    assertEquals(mergedList.next.value, 1);
    assertEquals(mergedList.next.next.value, 2);
    assertEquals(mergedList.next.next.next.value, 3);
    assertEquals(mergedList.next.next.next.next.value, 4);
    assertEquals(mergedList.next.next.next.next.next.value, 4);
    assertEquals(mergedList.next.next.next.next.next.next.value, 5);
    assertEquals(mergedList.next.next.next.next.next.next.next.value, 6);
  }
}
