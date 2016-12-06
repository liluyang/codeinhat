package com.fun.set2;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Solution026 extends Problem026 {
  @Override
  public int stepsToOne(int n) {
    int steps = 0;
    long s = n;
    while (s != 1) {
      s = s % 2 == 0 ? s / 2 : s * 3 + 1;
      steps++;
    }
    return steps;
  }

  @Override
  public int allStepsToOne(int n) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    map.put(1, 0);
    int count = 0;
    for (int i = 2; i <= n; i++) {
      count += stepsToOne(i, map);
    }
    return count;
  }

  private int stepsToOne(int n, HashMap<Integer, Integer> map) {
    if (map.containsKey(n))
      return map.get(n);
    int next = n % 2 == 0 ? n / 2 : n * 3 + 1;
    int steps = stepsToOne(next, map) + 1;
    map.put(n, steps);
    return steps;
  }

  @Test
  public void test() {
  }
}
