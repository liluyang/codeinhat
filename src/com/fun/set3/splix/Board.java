package com.fun.set3.splix;

public class Board {
  private int[][] board;

  public Board(int[][] board) {
    this.board = board;
  }

  /**
   * Returns true if g1 and g2 are connected.
   */
  public boolean isConnected(Grid g1, Grid g2) {
    // TODO: implement this function.
    return false;
  }

  public int width() {
    return board.length;
  }

  public int height() {
    return width() > 0 ? board[0].length : 0;
  }
}
