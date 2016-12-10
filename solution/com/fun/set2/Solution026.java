package com.fun.set2;

import org.testng.annotations.Test;

public class Solution026 extends Problem026 {
  @Override
  public int stepsToOne(int n) {
    int steps = 0;
    long s = n;
    while (s != 1) {
      s = s % 2 == 0 ? s / 2 : s * 3 + 1;
      steps++;
    }
    return steps;
  }

  @Test
  public void test() {
  }
}
