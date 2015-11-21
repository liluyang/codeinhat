package com.fun.set1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Given a paragraph with at most one telephone number, find out the telephone number and return.
 * If there is no telephone number, return null. Following telephone number formats are supported:
 * <ul>
 * <li>444-737-2138
 * <li>3097265148
 * <li>(800)213-7294
 * <li>650 734 7346
 * <li>1-408-624-3193
 * <li>314.509.2855
 * </ul>
 */
public class Problem008 {
  public String findTelephoneNumber(String text) {
    return "";
  }
  
  @Test
  public void test1() {
    assertEquals(findTelephoneNumber("Call me at 123-456-7890"), "1234567890");
  }
  
  @Test
  public void test2() {
    assertEquals(findTelephoneNumber("My phone number is 3141592653."), "3141592653");
  }
  
  @Test
  public void test3() {
    assertEquals(findTelephoneNumber("Phone: (271)828-1828"), "2718281828");
  }
  
  @Test
  public void test4() {
    assertEquals(findTelephoneNumber("Write down this number 577 215 6649"), "5772156649");
  }
  
  @Test
  public void test5() {
    assertEquals(findTelephoneNumber("I have a golden ratio number! 1-618-033-9887"), "6180339887");
  }
  
  @Test
  public void test6() {
    assertEquals(findTelephoneNumber(
        "Your number is start of rubik's cube solutions! 432.520.0327"), "4325200327");
  }
  
  @Test
  public void test7() {
    assertEquals(findTelephoneNumber("535_723_6048"), null);
  }
  
  @Test
  public void test8() {
    assertEquals(findTelephoneNumber("My SSN is 535-72-6048"), null);
  }
}
