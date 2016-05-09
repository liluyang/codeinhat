package com.fun.set1;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

/**
 * Given two numbers in string, which can be very big (bigger than long's range). Return the
 * sum of these two numbers in a string.
 */
public class Problem016 {
  public String sum(String a, String b) {
    return "";
  }
  
  @Test
  public void test1() {
    assertEquals(sum("0", "0"), "0");
  }
  
  @Test
  public void test2() {
    assertEquals(sum("1", "1"), "2");
  }
  
  @Test
  public void test3() {
    assertEquals(sum("1", "9"), "10");
  }
  
  @Test
  public void test4() {
    assertEquals(sum("9999999999999999999999999999999999", "1"),
        "10000000000000000000000000000000000");
  }
  
  @Test
  public void test5() {
    assertEquals(sum("123456", "976544"), "1100000");
  }
  
  @Test
  public void test6() {
    assertEquals(sum("1987345618347598176340598734059169348761593285761045761938476132748129365",
        "294365193465019834750198346918723548762340981275234850629436759817345092875067163487967"), 
        "294365193465021822095816694516899889361075040444583612222722520863107031351199911617332");
  }
}
