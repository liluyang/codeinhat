package com.fun.set1;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

/**
 * Given money amount, how many ways can you use penny, nickel, dime and quarter to make the same
 * amount?
 * 
 * Note: position matters. For example, a penny and a nickel is different from a nickel then a
 * penny.
 */
public class Problem020 {
  public long count(int amount) {
    return 0;
  }
  
  @Test
  public void test1() {
    assertEquals(count(1), 1L);
  }
  
  @Test
  public void test2() {
    assertEquals(count(10), 9L);
  }
  
  @Test
  public void test3() {
    assertEquals(count(100), 8577828731901L);
  }
  
  @Test
  public void test4() {
    assertEquals(count(48), 1047296L);
  }
  
  @Test
  public void test5() {
    assertEquals(count(150), 1194178451259318597L);
  }
  
  @Test
  public void test6() {
    assertEquals(count(26), 1243L);
  }
  
  @Test
  public void test7() {
    assertEquals(count(15), 42L);
  }
}
