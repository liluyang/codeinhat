package com.fun.set1;

import java.util.Random;

import org.testng.annotations.Test;

public class Solution011 extends Problem011 {
  @Override
  public int age(String treeLine) {
    if (treeLine.length() == 0) return 0;
    char current = treeLine.charAt(0);
    int count = current == '0' ? 1 : 0;
    for (int i = 1; i < treeLine.length(); i++) {
      char next = treeLine.charAt(i);
      if (next < current) count++;
      current = next;
    }
    return (count + 1) / 2;
  }
  
  @Test
  public void test() {
    Random random = new Random(System.currentTimeMillis());
    int N = 500;
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < N; i++) {
      builder.append(random.nextBoolean() ? "1" : "0");
    }
    String treeLine = builder.toString();
    System.out.println(treeLine + ", " + age(treeLine));
  }
}
