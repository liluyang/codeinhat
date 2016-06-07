package com.fun.set2;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

/**
 * Pinterest list images in two columns and follow the balance rule:
 * - if next left unused space is lower or equal to right side, put image on
 *   left.
 * - otherwise, put image on right.
 * 
 * After arrange all images in space, suppose user scroll on screen. positive
 * value means user scrolls downward, negative value means user scrolls upward.
 * After a sequence of user scrolls, screen stays at somewhere.
 * 
 * Question: please return all image indexes on screen now.
 * 
 * Note:
 * - user scroll won't go to negative value.
 * - user scroll won't go beyond the bottom of the lowest image.
 *
 */
public class Problem021 {
  public int[] imagesOnScreen(int screenHeight, int[] imageHeights, int[] moves) {
    return null;
  }
  
  @Test
  public void test1() {
    assertEquals(new int[]{0}, imagesOnScreen(1, new int[]{1}, new int[]{}));
  }
  
  @Test
  public void test2() {
    assertEquals(new int[]{0}, imagesOnScreen(1, new int[]{1}, new int[]{1}));
  }
  
  @Test
  public void test3() {
    assertEquals(new int[]{0}, imagesOnScreen(1, new int[]{1}, new int[]{1, -1}));
  }
  
  @Test
  public void test4() {
    assertEquals(new int[]{0, 1}, imagesOnScreen(1, new int[]{1, 1}, new int[]{-1, -1}));
  }
  
  @Test
  public void test5() {
    assertEquals(new int[]{0, 2, 3}, imagesOnScreen(2, new int[]{2, 1, 1, 3}, new int[]{1}));
  }
  
  @Test
  public void test6() {
    assertEquals(new int[]{1, 4, 5}, imagesOnScreen(9, new int[]{1, 1000, 2, 3, 4, 5, 6},
        new int[]{1, 2, 3}));
  }
  
  @Test
  public void test7() {
    assertEquals(new int[]{1, 4, 5}, imagesOnScreen(9, new int[]{1, 1000, 2, 3, 4, 5, 6},
        new int[]{-6, 1000, -1000, 6}));
  }
}
