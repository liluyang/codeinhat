package com.fun.set1;

import org.testng.annotations.Test;

public class Solution020 extends Problem020 {
  @Override
  public long count(int amount) {
    long[] res = new long[amount + 1];
    res[0] = 1;
    for (int i = 1; i <= amount; i++) {
      res[i] += res[i - 1];
      if (i >= 5) res[i] += res[i - 5];
      if (i >= 10) res[i] += res[i - 10];
      if (i >= 25) res[i] += res[i - 25];
    }
    return res[amount];
  }
  
  @Test
  public void test() {
  }
}
