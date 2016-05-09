package com.fun.set1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Josephus Problem: Given number M, N. M people sit in a circle, count them from 1,
 * remove Nth people out. Continue to count and remove, until last person. 
 * 
 * Question: what is the last one's index at the beginning?
 */
public class Problem015 {
  public int lastElement(int M, int N) {
    return 0;
  }
  
  @Test
  public void test1() {
    assertEquals(lastElement(9, 3), 1);
  }
  
  @Test
  public void test2() {
    assertEquals(lastElement(3, 3), 2);
  }
  
  @Test
  public void test3() {
    assertEquals(lastElement(3, 1), 3);
  }
  
  @Test
  public void test4() {
    assertEquals(lastElement(3, 10000), 2);
  }
  
  @Test
  public void test5() {
    assertEquals(lastElement(12345, 54321), 4820);
  }
  
  //@Test
  public void test6() {
    assertEquals(lastElement(123456, 654321), 72440);
  }
  
  //@Test
  public void test7() {
    assertEquals(lastElement(823456, 7654321), 683143);
  }
  
  @Test
  public void test8() {
    assertEquals(lastElement(3, 2), 3);
  }
}
