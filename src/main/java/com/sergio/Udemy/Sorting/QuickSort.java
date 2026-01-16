package com.sergio.Udemy.Sorting;

import java.util.Arrays;

/*
 * Dividimos la lista en dos recursivamente, una parte con los elementos más pequeños que el pivote
 * y la otra mitad con los más grandes.
 *
 * O(n log(n)) tiempo medio y O(n^2) peor caso porque el pivote podría estar lejos de la mediana.
 * Si el pivote seleccionado es siempre el mayor o menor número estaríamos haciando un bubble sort.
 */
public class QuickSort {

  public static void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private static void sort(int[] array, int left, int right) {
    if (left < right) {
      int index = partition(array, left, right);
      sort(array, left, index - 1);
      sort(array, index + 1, right);
      System.out.println(Arrays.toString(array));
    }
  }

  private static int partition(int[] array, int left, int right) {
    int pivot = array[right];

    int i = (left - 1);

    for (int j = left; j <= right - 1; j++) {
      if (array[j] < pivot) {
        i++;
        SearchUtils.swap(array, i, j);
      }
    }

    SearchUtils.swap(array, i + 1, right);
    return i + 1;
  }
}


//[0, 4, 8, 3, 6, 1, 7, 19, 12, 2] -> [0, 1, 2, 3, 6, 4, 7, 19, 12, 8]