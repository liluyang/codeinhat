package com.fun.set2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem029 {
  // red ball catchRate = 0.3
  // blue ball catchRate = 0.5
  // black ball catchRate = 0.7
  // if ball catchRate >= escapeRate, consider it is catch; otherwise no.
  public int maxCatch(int red, int blue, int black, double[] escapeRate) {
    return 0;
  }

  @Test
  public void test1() {
    runTest(1, 1, 1, new double[] {}, 0);
  }

  @Test
  public void test2() {
    runTest(1, 1, 1, new double[] { 0.3 }, 1);
  }

  @Test
  public void test3() {
    runTest(1, 1, 1, new double[] { 0.8 }, 0);
  }

  @Test
  public void test4() {
    runTest(1, 1, 1, new double[] { 0.2, 0.4, 0.6 }, 3);
  }

  @Test
  public void test5() {
    runTest(1, 1, 1, new double[] { 0.4, 0.6, 0.8 }, 2);
  }

  @Test
  public void test6() {
    runTest(5, 7, 9, new double[] { 0.2, 0.2, 0.2, 0.3, 0.3, 0.3, 0.4, 0.4, 0.4, 0.5, 0.5, 0.5, 0.6,
        0.6, 0.6, 0.7, 0.7, 0.7, 0.8, 0.8, 0.9, 0.9, 0.9 }, 18);
  }

  private void runTest(int red, int blue, int black, double[] escapeRate, int expected) {
    assertEquals(maxCatch(red, blue, black, escapeRate), expected);
  }
}
