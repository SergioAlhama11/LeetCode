package com.sergio.Udemy.StackQueues._02_valid_parenthesis;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Dado un String que solamente contiene los caracteres '(', ')', '{', '}', '[', ']', implementa un
 * algoritmo para determinar si es valido.
 *
 * <p>Ejemplo 1: Input: "([]){}" Output: True
 *
 * <p>Ejemplo 2: Input: "({)}" Output: False
 */
public class ValidParenthesis {

  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(getOpposite(c));
      } else {
        if (stack.isEmpty() || stack.pop() != c) return false;
      }
    }
    return stack.isEmpty();
  }

  private Character getOpposite(char c) {
    return switch (c) {
      case '(' -> ')';
      case '{' -> '}';
      case '[' -> ']';
      default -> '0';
    };
  }
}
