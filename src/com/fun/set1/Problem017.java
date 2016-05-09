package com.fun.set1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Given two numbers in string, which can be very big (bigger than long's range). Return the
 * multiplication of these two numbers in a string.
 */
public class Problem017 {
  public String multiply(String a, String b) {
    return "";
  }

  @Test
  public void test1() {
    assertEquals(multiply("2", "3"), "6");
  }

  @Test
  public void test2() {
    assertEquals(multiply("0", "123456789"), "0");
  }
  
  @Test
  public void test3() {
    assertEquals(multiply("123456789", "0"), "0");
  }

  @Test
  public void test4() {
    assertEquals(multiply("3", "4"), "12");
  }

  @Test
  public void test5() {
    assertEquals(multiply("25", "25"), "625");
  }

  @Test
  public void test6() {
    assertEquals(
        multiply(
            "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280"
                + "348253421170679",
            "271828182845904523536028747135266249775724709369995"),
            "85397342226735670654635508695465744950348885357650848812337172659816543480379544728323"
                + "04065619300439212742907297931644169288513714706402431173456376605");
  }
  
  @Test
  public void test7() {
    assertEquals(multiply("12345", "67891"), "838114395");
  }
}
