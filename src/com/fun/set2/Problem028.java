package com.fun.set2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem028 {
  public int[] numStream(int[] a) {
    int[] res = new int[2];
    // TODO: res[0] = longest sequence number, res[1] = number count
    return res;
  }

  @Test
  public void test1() {
    int[] a = new int[] { 1 };
    assertEquals(numStream(a), new int[] { 1, 1 });
  }

  @Test
  public void test2() {
    int[] a = new int[] { 1, 1, 2, 2, 2, 563, 78, 43, 43, 43, 21, 2, 2, 2, 2, 2, 5 };
    assertEquals(numStream(a), new int[] { 2, 5 });
  }

  @Test
  public void test3() {
    int[] a = new int[] { 1, 1, 2, 2, 2 };
    assertEquals(numStream(a), new int[] { 2, 3 });
  }

  @Test
  public void test4() {
    int[] a = new int[] { 1, 1, 1, 2, 2, 3, 3, 4, 4 };
    assertEquals(numStream(a), new int[] { 1, 3 });
  }

  @Test
  public void test5() {
    int[] a = new int[] { 1, 2, 1, 2, 1 };
    assertEquals(numStream(a), new int[] { 1, 1 });
  }

  @Test
  public void test6() {
    int[] a = new int[] { 1, 1, 1 };
    assertEquals(numStream(a), new int[] { 1, 3 });
  }
}
