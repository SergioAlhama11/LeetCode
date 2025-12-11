package com.sergio.Udemy.StackQueues._04_stack_min;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ¿Como disenarias un Stack que ademas de las operaciones de push y pop tambien contase con una
 * operacion para obtener el minimo?
 */
public class StackMin {

  Deque<Integer> stack = new ArrayDeque<>();
  Deque<Integer> minStack = new ArrayDeque<>();

  public void push(Integer data) {
    stack.push(data);
    if (minStack.isEmpty() || data <= minStack.peek()) {
      minStack.push(data);
    }
  }

  public int pop() {
    int value = stack.pop();
    if (value == minStack.peek()) minStack.pop();
    return value;
  }

  public int min() {
    return minStack.peek();
  }
}
