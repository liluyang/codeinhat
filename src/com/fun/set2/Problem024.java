package com.fun.set2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Game of life
 */
public class Problem024 {
  public int[][] next(int[][] states) {
    return null;
  }

  @Test
  public void test1() {
    assertEquals(next(new int[][] { { 0, 1 }, { 1, 0 } }), new int[][] { { 0, 0 }, { 0, 0 } });
  }

  @Test
  public void test2() {
    assertEquals(next(new int[][] { { 1, 1 }, { 1, 1 } }), new int[][] { { 1, 1 }, { 1, 1 } });
  }

  @Test
  public void test3() {
    assertEquals(next(new int[][] { { 1, 0, 1 }, { 1, 0, 1 }, { 1, 0, 1 } }),
        new int[][] { { 0, 0, 0 }, { 1, 0, 1 }, { 0, 0, 0 } });
  }
}
