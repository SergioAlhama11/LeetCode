package com.sergio.Udemy.ExtraProblems._05_house_robber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HouseRobberTest {
  private final HouseRobber solver = new HouseRobber();

  @Test
  void houseRobberTest1() {
    int[] arr = {1,2,3,1};
    assertEquals(4, solver.rob(arr));
  }

  @Test
  void houseRobberDPTest1() {
    int[] arr = {1,2,3,1};
    assertEquals(4, solver.dpRob(arr));
  }

  @Test
  void houseRobberTest2() {
    int[] arr = {2,7,9,3,1};
    assertEquals(12, solver.rob(arr));
  }

  @Test
  void houseRobberDPTest2() {
    int[] arr = {2,7,9,3,1};
    assertEquals(12, solver.dpRob(arr));
  }
}
