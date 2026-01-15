package com.sergio.Udemy.Sorting;


public class MergeSort {

  public static void sort(int[] array) {
    int[] helper = new int[array.length];
    sort(array, helper, 0, array.length - 1);
  }

  private static void sort(int[] array, int[] helper, int left, int right) {
    if (left < right) {
      int middle =  (left + right) / 2;
      sort(array, helper, left, middle);
      sort(array, helper, middle + 1, right);
      merge(array, helper, left, middle, right);
    }
  }

  private static void merge(int[] array, int[] helper, int left, int middle, int right) {
    for (int i = left; i <= right; i++ ) {
      helper[i] = array[i];
    }

    int helperLeft = left;
    int helperRight = middle + 1;
    int current = left;

    while (helperLeft <= middle && helperRight <= right) {
      if (helper[helperLeft] <= helper[helperRight]) {
        array[current] = helper[helperLeft];
        helperLeft++;
      } else {
        array[current] = helper[helperRight];
        helperRight++;
      }
      current++;
    }

    int leftRemaining = middle - helperLeft;
    for (int i = 0; i <= leftRemaining; i++) {
      array[current + i] = helper[helperLeft + i];
    }
  }
}
