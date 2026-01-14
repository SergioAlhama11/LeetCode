package com.sergio.Udemy.DynamicProgramming._05_binary_tree_max_path_sum;

/*
 * Dado un árbol binario, devuelve el camino con mayor suma acumulada.
 *
 * Nota: Un camino en un árbol es una secuencia de nodos conectados en la que el
 * mismo nodo no puede aparecer dos veces. El camino no tiene por qué pasar por la
 * raíz.
 *
 * Ejemplo 1:
 *  Input:
 *        2
 *     1     3
 *  -5     -1
 *
 *  Output:
 *    6 (path 1-2-3)
 *
 * Ejemplo 2:
 *  Input:
 *       -12
 *     5     3
 *         1   4
 *
 *  Output:
 *    8 (path 1-3-4)
 *
 */
public class BinaryTreeMaxPathSum {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }
  }

  private static int max = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode node) {
    maxPathSumHelper(node);
    return max;
  }

  private int maxPathSumHelper(TreeNode node) {
    if (node == null) return 0;

    // Mejor camino que viene de los hijos (ignorar negativos)
    int left = Math.max(0, maxPathSumHelper(node.left));
    int right = Math.max(0, maxPathSumHelper(node.right));

    // Camino que pasa por este nodo
    int currentPath = node.val + left + right;

    // Actualizar máximo global
    max = Math.max(max, currentPath);

    // Devolver el mejor camino hacia arriba (solo un lado)
    return node.val + Math.max(left, right);
  }
}
