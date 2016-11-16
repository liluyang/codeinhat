package com.fun.set2;

import org.testng.annotations.Test;

public class Solution024 extends Problem024 {
  public int[][] next(int[][] states) {
    int M = states.length;
    int N = states[0].length;
    int[][] a = new int[M][N];

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        a[i][j] = next(states, i, j, M, N);
      }
    }
    return a;
  }

  private int next(int[][] states, int i, int j, int M, int N) {
    int neighbor = 0;
    for (int x = -1; x < 2; x++) {
      for (int y = -1; y < 2; y++) {
        if (i + x >= 0 && i + x < M && j + y >= 0 && j + y < N)
          neighbor += states[i + x][j + y];
      }
    }
    neighbor -= states[i][j];
    if (states[i][j] == 1) {
      return neighbor < 2 || neighbor > 3 ? 0 : 1;
    }
    return neighbor == 3 ? 1 : 0;
  }

  @Test
  public void test() {
  }
}
