package com.fun.set2;

import org.testng.annotations.Test;

public class Solution029 extends Problem029 {
  public int maxCatch(int red, int blue, int black, double[] escapeRate) {
    int x = red;
    int y = blue;
    int z = black;
    int count = 0;
    for (double i : escapeRate) {
      if (i <= 0.3 && x >= 0) {
        count++;
        x--;
      } else if (i <= 0.5 && y >= 0) {
        count++;
        y--;
      } else if (i <= 0.7 && z >= 0) {
        count++;
        z--;
      }
    }
    return count;
  }

  @Test
  public void test() {

  }
}
