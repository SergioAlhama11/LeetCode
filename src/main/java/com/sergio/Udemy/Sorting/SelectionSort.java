package com.sergio.Udemy.Sorting;

import java.util.Arrays;

public class SelectionSort {

  // [8, 4, 0, 3, 6, 1, 7, 19, 12, 2]
  public static void sort(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = findMinimumElementIndex(array, i);
      SearchUtils.swap(array, i, minIndex);
      System.out.println(Arrays.toString(array));
    }
  }

  private static int findMinimumElementIndex(int[] array, int start) {
    int minIndex = start;
    for (int i = start + 1; i < array.length; i++) {
      if (array[i] < array[minIndex]) minIndex = i;
    }
    return minIndex;
  }
}

//    [8, 4, 0, 3, 6, 1, 7, 19, 12, 2]
//    [0, 4, 8, 3, 6, 1, 7, 19, 12, 2]
//    [0, 1, 8, 3, 6, 4, 7, 19, 12, 2]
//    [0, 1, 2, 3, 6, 4, 7, 19, 12, 8]
//    [0, 1, 2, 3, 6, 4, 7, 19, 12, 8]
//    [0, 1, 2, 3, 4, 6, 7, 19, 12, 8]
//    [0, 1, 2, 3, 4, 6, 7, 19, 12, 8]
//    [0, 1, 2, 3, 4, 6, 7, 19, 12, 8]
//    [0, 1, 2, 3, 4, 6, 7, 8, 12, 19]
//    [0, 1, 2, 3, 4, 6, 7, 8, 12, 19]
