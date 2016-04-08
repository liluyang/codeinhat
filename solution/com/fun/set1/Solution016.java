package com.fun.set1;

import org.testng.annotations.Test;

public class Solution016 extends Problem016 {
  @Override
  public String sum(String a, String b) {
    StringBuilder builder = new StringBuilder();
    char[] v1 = new StringBuilder(a).reverse().toString().toCharArray();
    char[] v2 = new StringBuilder(b).reverse().toString().toCharArray();
    int max = Math.max(v1.length, v2.length);
    int current = 0;
    for (int i = 0; i < max; i++) {
      if (i < v1.length) current += v1[i] - '0';
      if (i < v2.length) current += v2[i] - '0';
      builder.append(current % 10);
      current /= 10;
    }
    if (current > 0) builder.append(current);
    return builder.reverse().toString();
  }
  
  @Test
  public void test() {
  }
}
