package com.sergio.Udemy.Sorting;

public class BubbleSort {

  // [3, 5, 1, 2, 4]
  public static void sort(int[] array) {
    boolean swapped;

    for (int i = 0; i < array.length - 1; i++) {
      swapped = false;

      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          SearchUtils.swap(array, j, j + 1);
          swapped = true;
        }
      }

      if (!swapped) break;
    }
  }
}
