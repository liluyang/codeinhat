package com.fun.set1;

import org.testng.annotations.Test;

public class Solution017 extends Problem017 {
  @Override
  public String multiply(String a, String b) {
    int M = a.length();
    int N = b.length();
    int[] res = new int[M + N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        res[i + j] += (a.charAt(M - i - 1) - '0') * (b.charAt(N - j - 1) - '0');
      }
    }
    
    StringBuilder builder = new StringBuilder();
    int r = 0;
    for (int i : res) {
      r += i;
      builder.append(r % 10);
      r /= 10;
    }
    if (r > 0) {
      return builder.reverse().insert(0, r).toString();
    }
    
    int i = builder.length() - 1;
    while (builder.charAt(i) == '0' && i > 0) {
      i--;
    }
    return builder.reverse().substring(builder.length() - i - 1).toString();
  }
  
  @Test
  public void test() {
  }
}
