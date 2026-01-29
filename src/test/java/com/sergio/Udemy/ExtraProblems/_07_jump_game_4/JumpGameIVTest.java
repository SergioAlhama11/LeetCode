package com.sergio.Udemy.ExtraProblems._07_jump_game_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JumpGameIVTest {
  private final JumpGameIV solver = new JumpGameIV();

  @Test
  void singleElementArray() {
    int[] arr = {0};
    assertEquals(0, solver.minJumps(arr));
  }

  @Test
  void exampleFromLeetCode() {
    int[] arr = {100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
    assertEquals(3, solver.minJumps(arr));
  }

  @Test
  void allSameValues() {
    int[] arr = {7, 7, 7, 7, 7};
    assertEquals(1, solver.minJumps(arr));
  }

  @Test
  void noSameValueShortcuts() {
    int[] arr = {1, 2, 3, 4, 5};
    assertEquals(4, solver.minJumps(arr));
  }

  @Test
  void alternatingValues() {
    int[] arr = {7, 6, 9, 6, 9, 6, 9, 7};
    assertEquals(1, solver.minJumps(arr));
  }

  @Test
  void largeJumpDirectlyToEnd() {
    int[] arr = {5, 1, 1, 1, 1, 1};
    assertEquals(1, solver.minJumps(arr));
  }

  @Test
  void needToMoveBackwardFirst() {
    int[] arr = {3, 4, 2, 1, 2, 3, 4};
    assertEquals(3, solver.minJumps(arr));
  }

  @Test
  void repeatedValuesWithNoise() {
    int[] arr = {1, 2, 1, 1, 1, 2, 1};
    assertEquals(3, solver.minJumps(arr));
  }
}
