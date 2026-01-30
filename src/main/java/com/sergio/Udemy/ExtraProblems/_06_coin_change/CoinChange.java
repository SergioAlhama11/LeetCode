package com.sergio.Udemy.ExtraProblems._06_coin_change;

/*
 * Dado un array de enteros que representa los distintos tipos de monedas disponibles,
 * devuelve el mínimo número de monedas posible para sumar un valor amount.
 *
 * Si es imposible sumar ese valor, devuelve -1
 *
 * Ejemplo 1:
 *  Input:
 *    coins = [1,2,5]
 *    amount = 11
 *  Output: 3 (5 + 5 + 1)
 *
 * Ejemplo 2:
 *  Input:
 *    coins = [2]
 *    amount = 3
 *  Output: -1
 */

import java.util.Arrays;

// dp[0] = 0
// dp[1] = 1
// dp[2] = 1
// dp[3] = 2
// dp[4] = 2
// dp[5] = 1
public class CoinChange {

  public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];

    Arrays.fill(dp, amount + 1);

    dp[0] = 0;

    for (int i = 1; i <= amount; i++) {
      for (int coin : coins) {
        if (i - coin >= 0) {
          dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
      }
    }
    return dp[amount] > amount ? -1 : dp[amount];
  }

  public int coinChangeDFSMemo(int[] coins, int amount) {
    int[] memo = new int[amount + 1];
    Arrays.fill(memo, -2);
    return dfs(coins, amount, memo);
  }

  private int dfs(int[] coins, int amount, int[] memo) {

    if (amount == 0) return 0;
    if (amount < 0) return -1;
    if (memo[amount] != -2) return memo[amount];

    int min = Integer.MAX_VALUE;

    for (int coin : coins) {
      int res = dfs(coins, amount - coin, memo);
      if (res >= 0) {
        min = Math.min(min, res + 1);
      }
    }

    memo[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
    return memo[amount];
  }
}
