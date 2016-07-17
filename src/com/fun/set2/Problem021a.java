package com.fun.set2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Pinterest list images in two columns and follow the balance rule:
 * - if next left unused space is lower or equal to right side, put image on
 *   left.
 * - otherwise, put image on right.
 * 
 * Question: return height occupied by these images.
 *
 */
public class Problem021a {
  public int height(int[] imageHeights) {
    return 0;
  }
  
  @Test
  public void test1() {
    assertEquals(1, height(new int[]{1, 1}));
  }
  
  @Test
  public void test2() {
    assertEquals(1, height(new int[]{1}));
  }
  
  @Test
  public void test3() {
    assertEquals(0, height(new int[]{}));
  }
  
  @Test
  public void test4() {
    assertEquals(35, height(new int[]{10, 30, 10, 15}));
  }
  
  @Test
  public void test5() {
    assertEquals(72, height(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}));
  }
}
