package com.fun.set1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Solution012 extends Problem012 {
  public String residual(int a, int b, int start, int end) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i <= end; i++) {
      int quotient = a / b;
      int remainder = a % b;
      if (i >= start) {
        builder.append(quotient);
      }
      a = remainder * 10;
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
