package com.fun.set1;

import java.util.Random;

import org.testng.annotations.Test;

public class Solution010 extends Problem010 {
  public int maxProfit(int[] price) {
    if (price.length == 0) return 0;
    
    int current = price[0];
    int profit = 0;
    for (int i = 1; i < price.length; i++) {
      if (price[i] >= current) {
        profit += price[i] - current;
      }
      current = price[i];
    }
    return profit;
  }
  
  @Test
  public void test() {
  }
  
  public void testGenerator() {
    int N = 5000;
    Random random = new Random(System.currentTimeMillis());
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = random.nextInt(20);
      System.out.print(a[i]);
      System.out.print(i == N - 1 ? "\n" : ", ");
    }
    System.out.println("Max profit = " + maxProfit(a));
  }
}
