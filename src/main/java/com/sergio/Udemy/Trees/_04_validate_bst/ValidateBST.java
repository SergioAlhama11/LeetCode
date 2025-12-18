package com.sergio.Udemy.Trees._04_validate_bst;

import com.sergio.Udemy.Trees._00_binary_tree.Node;

/*
 * Determina si un árbol binario es un árbol binario de búsqueda válido:
 *  - El subárbol izquierdo de un nodo contiene solamente nodos <= que él.
 *  - El subárbol derecho de un nodo contiene solamente nodos > que él.
 *  - Ambos subárboles deben ser a su vez árboles binarios de búsqueda.
 *
 * Ejemplo 1:
 *  Input:
 *         4
 *      5     7
 *    1   3
 *  8
 *
 *  Output: false
 *
 * Ejemplo 2:
 *  Input:
 *         4
 *      2     7
 *    1   3  5
 *
 *  Output: true
 */
public class ValidateBST {

  public boolean isValidBST(Node root) {
    return validateBST(root, null, null);
  }

  private boolean validateBST(Node root, Integer min, Integer max) {
    if (root == null) return true;

    if ((min != null && root.value <= min) || (max != null && root.value >= max)) return false;

    return validateBST(root.left, min, root.value) && validateBST(root.right, root.value, max);
  }
}
