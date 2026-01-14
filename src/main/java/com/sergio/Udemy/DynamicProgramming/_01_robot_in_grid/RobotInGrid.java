package com.sergio.Udemy.DynamicProgramming._01_robot_in_grid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Un robot está en la esquina superior izquierda (0,0) de un tablero m x n. En el tablero hay celdas
 * transitables (true) y no transitables (false). Encuentra un camino válido para ir a la esquina
 * inferior izquierda con el robot, sabiendo que solo se puede mover hacia abajo y hacia la derecha.
 *
 * Ejemplo 1:
 *  Input:
 *    [
 *      [true,true,true,true]
 *      [false,false,false,true]
 *      [true,true,false,true]
 *      [true,true,false,true]
 *    ]
 *
 *  Output: [(0,0), (0,1), (0,2), (0,3), (1,3), (2,3), (3,3)]
 *
 * Ejemplo 2:
 *  Input:
 *    [
 *      [true,true,true,true]
 *      [false,true,true,true]
 *      [true,true,false,false]
 *      [true,true,true,true]
 *    ]
 *
 *  Output: [(0,0), (0,1), (1,1), (2,1), (3,1), (3,2), (3,3)]
 *
 */
public class RobotInGrid {

  public List<Cell> getPath(boolean[][] grid) {
    List<Cell> path = new ArrayList<>();
    if (getPath(grid, 0, 0, path)) {
      Collections.reverse(path);
      return path;
    }

    return null;
  }

  private boolean getPath(boolean[][] grid, int row, int col, List<Cell> path) {
    if (row >= grid.length || col >= grid[0].length || !grid[row][col]) return false;

    boolean isAtFinish = (row == grid.length - 1 && col == grid[0].length - 1);

    if (isAtFinish || getPath(grid, row, col + 1, path) || getPath(grid, row + 1, col, path)) {
      Cell cell = new Cell(row, col);
      path.add(cell);
      return true;
    }

    grid[row][col] = false;
    return false;
  }
}
