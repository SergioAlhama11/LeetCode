package com.sergio.Udemy.StackQueues._02_valid_parenthesis;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidParenthesisTest {

  @Test
  void validParenthesisTest() {
    ValidParenthesis validParenthesis = new ValidParenthesis();

    assertTrue(validParenthesis.isValid("([]){}"));
    assertFalse(validParenthesis.isValid("({)}"));
  }
}
