package com.sergio.Udemy.DynamicProgramming._02_set_subsets;

import java.util.ArrayList;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un conjunto de enteros
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 *
 * 0: []
 * 1: [], [1]
 * 2: [], [1], [2], [1, 2]
 * 3: [], [1], [2], [1, 2] + [3], [1, 3], [2, 3], [1, 2, 3]
 */
public class SetSubsets {

  List<List<Integer>> subsets(List<Integer> set) {
    List<List<Integer>> res = new ArrayList<>();

    res.add(new ArrayList<>());

    for (Integer element : set) {
      duplicateSubsetsAddingElement(element, res);
    }

    return res;
  }

  private void duplicateSubsetsAddingElement(Integer element, List<List<Integer>> res) {
    int currentSize = res.size();

    for (int i = 0; i < currentSize; i++) {
      List<Integer> newSubset = new ArrayList<>(res.get(i));
      newSubset.add(element);
      res.add(newSubset);
    }
  }
}
