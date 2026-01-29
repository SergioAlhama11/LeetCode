package com.sergio.Udemy.ExtraProblems._07_jump_game_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Dado un array de enteros arr, inicialmente se posiciona en el primer índice del array.
 *
 * <p>En un solo paso, puede saltar del índice i al índice:
 *
 * <p>i + 1 donde: i + 1 < arr.length. i - 1 donde: i - 1 >= 0. j donde: arr[i] == arr[j] e i != j.
 * Devuelve el número mínimo de pasos para llegar al último índice del array.
 *
 * <p>Tenga en cuenta que no puede saltar fuera del array en ningún momento.
 */
public class JumpGameIV {

  // [100,-23,-23,404,100,23,23,23,3,404]
  // [false, visited, false, false, false, false, false, false, false, false]
  // Queue: 0 , 2 , 3, 4, 9 ,5 ,6, 7
  public int minJumps(int[] arr) {
    int n = arr.length;
    if (n == 1) return 0;

    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
    }

    boolean[] visited = new boolean[n];
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(0);
    visited[0] = true;

    int steps = 0;

    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int s = 0; s < size; s++) {
        int i = queue.poll();

        if (i == n - 1) return steps;

        // i - 1
        if (i - 1 >= 0 && !visited[i - 1]) {
          visited[i - 1] = true;
          queue.offer(i - 1);
        }

        // i + 1
        if (i + 1 < n && !visited[i + 1]) {
          visited[i + 1] = true;
          queue.offer(i + 1);
        }

        // saltos por mismo valor
        List<Integer> sameValueIndices = map.get(arr[i]);
        if (sameValueIndices != null) {
          for (int j : sameValueIndices) {
            if (!visited[j]) {
              visited[j] = true;
              queue.offer(j);
            }
          }
          map.remove(arr[i]);
        }
      }
      steps++;
    }
    return -1;
  }
}
