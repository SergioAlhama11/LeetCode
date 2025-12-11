package com.sergio.Udemy.StackQueues._01_queue_with_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Implementa una clase MyQueue utilizando dos stacks.
 *
 * <p>Como Stack usaremos la Interfaz Deque, que proporciona las operaciones de una cola doblemente
 * terminada, permitiendola usar como Pila o Cola (solo las operaciones de Pila estan permitidas en
 * este ejercicio).
 *
 * <p>Java tambien tiene la clase Stack, pero su uso no esta recomendado por extender de la clase
 * Vector, que no tiene demasiado sentido, y por ser una clase especifica y no una interfaz. Si
 * quieres saber mas sobre este tema puedes acceder al siguiente enlace:
 * https://stackoverflow.com/questions/12524826/why-should-i-use-deque-over-stack
 */
public class QueueWithStacks {
  Deque<Integer> firstStack = new ArrayDeque<>();
  Deque<Integer> secondStack = new ArrayDeque<>();

  public void add(Integer value)  {
    firstStack.push(value);
  }

  public Integer peek() {
    dumpElementIntoSecondStack();
    return secondStack.peek();
  }

  public Integer remove() {
    dumpElementIntoSecondStack();
    return secondStack.pop();
  }

  private void dumpElementIntoSecondStack() {
    if (secondStack.isEmpty()) {
      while (!firstStack.isEmpty()) {
        secondStack.push(firstStack.pop());
      }
    }
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    return firstStack.size() + secondStack.size();
  }
}
