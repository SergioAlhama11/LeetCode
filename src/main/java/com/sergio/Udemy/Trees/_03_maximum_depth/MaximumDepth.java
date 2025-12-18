package com.sergio.Udemy.Trees._03_maximum_depth;

import com.sergio.Udemy.Trees._00_binary_tree.Node;

/*
 * Dada la raíz de un árbol binario, devuelve su profundidad máxima.
 *
 * Ejemplo:
 *  Input:
 *         4
 *      2     7
 *    1   3
 *  8
 *
 *  Output: 4
 */
public class MaximumDepth {

    public int maxDepth(Node root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.left) + 1;
        int rightDepth = maxDepth(root.right) + 1;

        return Math.max(leftDepth, rightDepth);
    }
}
