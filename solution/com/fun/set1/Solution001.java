package com.fun.set1;

import org.testng.annotations.Test;

public class Solution001 extends Problem001 {
  @Override
  public int solve(String scores) {
    int res = 0;
    for (int i = 0; i < scores.length() - 1; i++) {
      res += Math.abs(scores.charAt(i) - scores.charAt(i + 1));
    }
    return res;
  }
  
  @Test
  public void test() {
  }
}
