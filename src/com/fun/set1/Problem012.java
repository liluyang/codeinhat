package com.fun.set1;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

/**
 * Given numerator and denominator, calculate the number from start position
 * (after dot) to end position.
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
    assertEquals(residual(10, 20, 1, 3), "500");
  }

  @Test
  public void test4() {
    assertEquals(residual(1, 7, 2, 5), "4285");
  }

  @Test
  public void test5() {
    assertEquals(residual(1, 7, 100, 108), "857142857");
  }

  @Test
  public void test6() {
    assertEquals(residual(200533, 31415926, 300, 400),
        "144801206878320250690684718317709304510075558492211880050901571387709533056577737036941072"
        + "49934316753");
  }
  
  @Test
  public void test7() {
    assertEquals(residual(2007423, 27182818, 300, 500), 
        "843714216826231923415740045789218763117201461599750254002362816099493437361792290997938477"
        + "1659803630366800086731257958611943765359426679014662865343835948134590019327650282616026"
        + "04998495740949301135739");
  }
}
