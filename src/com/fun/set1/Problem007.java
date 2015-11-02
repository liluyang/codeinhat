package com.fun.set1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Given an input string, a set of spam words, and threshold. If input string contains distinct
 * spam words no less than threshold times, we think input is possible spam and return true.
 * Otherwise, return false.
 */
public class Problem007 {
  public boolean isSpam(String input, String[] spamWords, int threshold) {
    return false;
  }
  
  @Test
  public void test1() {
    assertEquals(
        isSpam("Grand opening offer @Hall!", new String[]{"grand", "opening", "offer"}, 3), true);
  }
  
  @Test
  public void test2() {
    assertEquals(isSpam("Grandma finds an opening job which offer 100$/hour!",
        new String[]{"grand", "opening", "offer"}, 3), false);
  }
  
  @Test
  public void test3() {
    assertEquals(isSpam("Grand opening hot offer",
        new String[]{"grand", "opening", "offer"}, 3), true);
  }
  
  @Test
  public void test4() {
    assertEquals(isSpam("Use promo code FEELGOOD to get an extra 15% off 2+ night hotel stays.",
        new String[]{"promo", "extra", "off"}, 3), true);
  }
  
  @Test
  public void test5() {
    assertEquals(isSpam("opening, opening, and opening",
        new String[]{"grand", "opening", "offer"}, 3), false);
  }
}
