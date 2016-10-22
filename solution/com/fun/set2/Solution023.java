package com.fun.set2;

import org.testng.annotations.Test;

public class Solution023 extends Problem023 {
  @Override
  public int walkNeed(String[] data) {
    int walkToCandy = Integer.parseInt(data[1]);
    int candies = Integer.parseInt(data[2]);
    int candyNeed = Integer.parseInt(data[3]);
    int i = 4;
    while (!"#".equals(data[i])) {
      candyNeed += Integer.parseInt(data[i]) - 1;
      i++;
    }
    return Math.max(0, (candyNeed - candies) * walkToCandy);
  }

  @Test
  public void test() {
  }
}
