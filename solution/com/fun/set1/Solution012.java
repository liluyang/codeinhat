package com.fun.set1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Solution012 extends Problem012 {
  public String residual(int numerator, int denominator, int start, int end) {
    StringBuilder builder = new StringBuilder();
    numerator %= denominator;
    for (int i = 0; i < end; i++) {
      numerator *= 10;
      int quotient = numerator / denominator;
      if (i >= start - 1) {
        builder.append(quotient);
      }
      numerator %= denominator;
    }
    return builder.toString();
  }
  
  @Test
  public void test() {
    assertEquals(residual(2007423, 27182818, 300, 500), 
        "843714216826231923415740045789218763117201461599750254002362816099493437361792290997938477"
        + "1659803630366800086731257958611943765359426679014662865343835948134590019327650282616026"
        + "04998495740949301135739");
  }
}
