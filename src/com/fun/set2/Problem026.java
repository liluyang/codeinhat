package com.fun.set2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Collatz Conjecture
 * 
 * Start with number N, if it is even, divide by 2; if it is odd, multiple by 3
 * and plus 1. Repeat this process, see how many steps N will turn into 1.
 */
public class Problem026 {
  public int stepsToOne(int n) {
    return 0;
  }

  @Test
  public void test1() {
    assertEquals(stepsToOne(1), 0);
  }

  @Test
  public void test2() {
    assertEquals(stepsToOne(2), 1);
  }

  @Test
  public void test3() {
    assertEquals(stepsToOne(88), 17);
  }

  @Test
  public void test4() {
    assertEquals(stepsToOne(1023), 62);
  }

  @Test
  public void test5() {
    assertEquals(stepsToOne(123456789), 177);
  }
}
