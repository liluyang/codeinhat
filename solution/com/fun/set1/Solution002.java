package com.fun.set1;

import java.util.ArrayDeque;
import java.util.Queue;

import org.testng.annotations.Test;

public class Solution002 extends Problem002 {
  public int solve(int[] weight, int bridgeLength, int maxLoad) {
    int onBridge = 0;
    Queue<Integer> queue = new ArrayDeque<Integer>();
    for (int i = 0; i < weight.length; i++) {
      if (queue.size() >= bridgeLength) {
        onBridge -= queue.remove();
      }
      queue.add(weight[i]);
      onBridge += weight[i];
      if (onBridge > maxLoad) {
        return i + 1;
      }
    }
    return -1;
  }
  
  @Test
  public void test() {
  }
}
