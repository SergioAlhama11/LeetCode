package com.sergio.Udemy.Trees._06_first_common_ancestor;

import com.sergio.Udemy.Trees._00_binary_tree.Node;

/*
 * Devuelve el primer ancestro común de dos nodos.
 *
 * Ejemplo:
 *  Input:
 *         4
 *      5     7
 *    1   3
 *  8
 *
 *  firstCommonAncestor(1, 7) = 4
 *  firstCommonAncestor(1, 4) = null
 *  firstCommonAncestor(1, 3) = 5
 *
 */
public class FirstCommonAncestor {

  class AncestorNode {
    boolean nodeFound;
    Node ancestor;
  }

  public Node firstCommonAncestor(Node root, Node firstNode, Node secondNode) {
    return postOrderSearch(root, firstNode, secondNode).ancestor;
  }

  private AncestorNode postOrderSearch(Node root, Node firstNode, Node secondNode) {
    if (root == null) return new AncestorNode();

    AncestorNode leftResult = postOrderSearch(root.left, firstNode, secondNode);
    if (leftResult.ancestor != null) return leftResult;

    AncestorNode rightResult = postOrderSearch(root.right, firstNode, secondNode);
    if (rightResult.ancestor != null) return rightResult;

    AncestorNode result = new AncestorNode();
    if (leftResult.nodeFound && rightResult.nodeFound) {
      result.ancestor = root;
      return result;
    }

    result.nodeFound =
        root == firstNode || root == secondNode || leftResult.nodeFound || rightResult.nodeFound;
    return result;
  }
}
