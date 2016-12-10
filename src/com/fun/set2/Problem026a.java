package com.fun.set2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem026a {
  /**
   * Count for number 1 to n, how many steps to turn all of them into 1?
   */
  public int allStepsToOne(int n) {
    return 0;
  }

  @Test
  public void test1() {
    assertEquals(allStepsToOne(1), 0);
  }

  @Test
  public void test2() {
    assertEquals(allStepsToOne(2), 1);
  }

  @Test
  public void test3() {
    assertEquals(allStepsToOne(88), 2554);
  }

  @Test
  public void test4() {
    assertEquals(allStepsToOne(1023), 61307);
  }

  @Test
  public void test5() {
    assertEquals(allStepsToOne(12345), 1072042);
  }
}
