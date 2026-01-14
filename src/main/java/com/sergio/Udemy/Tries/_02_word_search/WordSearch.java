package com.sergio.Udemy.Tries._02_word_search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Dado un tablero m x n y un array de palabras, retorna todas las palabras existentes en el tablero.
 * Las palabras se pueden formar con caracteres horizontales o verticales, y un caracter no puede ser
 * usado múltiples veces en una palabra.
 *
 * Ejemplo:
 *  Input:
 *    [
 *      ["p","e","r","o"]  ||  board[0][0]: p | board[0][1]: e | board[0][2]: r | board[0][3]: o
 *      ["a","t","a","e"]  ||  board[1][0]: a | board[1][1]: t | board[1][2]: a | board[1][3]: e
 *      ["t","e","l","v"]  ||  board[2][0]: t | board[2][1]: e | board[2][2]: l | board[2][3]: v
 *      ["o","f","l","v"]  ||  board[3][0]: o | board[3][1]: f | board[3][2]: l | board[3][3]: v
 *    ]
 *
 *    words = ["pero","pato","comida", "veo", "pata"]
 *
 *  Output: ["pero","pato", "veo", "pata"]
 *
 */
public class WordSearch {

  static class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    String word;
  }

  public List<String> findWords(char[][] board, String[] words) {
    TrieNode root = buildTrie(words);
    Set<String> result = new HashSet<>();

    int rows = board.length;
    int cols = board[0].length;

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        dfs(board, row, col, root, result);
      }
    }

    return new ArrayList<>(result);
  }

  private void dfs(char[][] board, int row, int col, TrieNode node, Set<String> result) {
    char c = board[row][col];

    if (c == '#' || !node.children.containsKey(c)) {
      return;
    }

    TrieNode nextNode = node.children.get(c);

    if (nextNode.word != null) {
      result.add(nextNode.word);
    }

    board[row][col] = '#';

    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    for (int[] d : directions) {
      int nextRow = row + d[0];
      int nextCol = col + d[1];
      if (nextRow >= 0 && nextRow < board.length && nextCol >= 0 && nextCol < board[0].length) {
        dfs(board, nextRow, nextCol, nextNode, result);
      }
    }

    board[row][col] = c; // backtracking
  }

  private TrieNode buildTrie(String[] words) {
    TrieNode root = new TrieNode();

    for (String word : words) {
      TrieNode node = root;
      for (char c : word.toCharArray()) {
        node = node.children.computeIfAbsent(c, k -> new TrieNode());
      }
      node.word = word;
    }
    return root;
  }
}
