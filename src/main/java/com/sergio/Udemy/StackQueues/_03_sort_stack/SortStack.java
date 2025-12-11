package com.sergio.Udemy.StackQueues._03_sort_stack;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Ordena un Stack de forma que los elementos mas pequenos queden en el tope del Stack.
 * Puedes usar un Stack adicional, pero no esta permitido copiar loe elementos a otra estructura
 * de datos
 *
 * Ejemplo:
 *  Input: (tope) 5 -> 1 -> 4 -> 2
 *  Output: (tope) 1 -> 2 -> 4 -> 5
 *
 *  1 4 2   ||  4 2   ||  1 2   || 2      || 1      ||  ---
 *  5       ||  1 5   ||  4 5   || 1 4 5  || 2 4 5  ||  1 2 4 5 <-
 */
public class SortStack {

  public Deque<Integer> sort(Deque<Integer> stack) {
    Deque<Integer> sortedStack = new ArrayDeque<>();

    while (!stack.isEmpty()) {
      Integer temp = stack.pop();
      while (!sortedStack.isEmpty() && temp > sortedStack.peek()) {
        stack.push(sortedStack.pop());
      }
      sortedStack.push(temp);
    }
    return sortedStack;
  }
}
