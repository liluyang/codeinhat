package com.fun.set1;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

/**
 * Given numerator and denominator, calculate the number from start position (after dot) to end
 * position. 
 */
public class Problem012 {
  public String residual(int numerator, int denominator, int start, int end) {
    return null;
  }
  
  @Test
  public void test1() {
    assertEquals(residual(1, 3, 1, 3), "333");
  }
  
  @Test
  public void test2() {
    assertEquals(residual(1000, 3, 1, 3), "333");
  }
  
  @Test
  public void test3() {
    assertEquals(residual(10, 30, 1, 3), "500");
  }
  
  @Test
  public void test4() {
    assertEquals(residual(1, 7, 2, 5), "4285");
  }
}
