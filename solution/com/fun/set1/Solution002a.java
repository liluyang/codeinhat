package com.fun.set1;

import java.util.ArrayDeque;
import java.util.Queue;

import org.testng.annotations.Test;

import com.fun.utils.PrintUtils;
import com.fun.utils.RandomUtils;

public class Solution002a extends Problem002a {
  public int solve(int[][] weight, int bridgeLength, int maxLoad) {
    int onBridge = 0;
    Queue<Integer> queue1 = new ArrayDeque<Integer>();
    Queue<Integer> queue2 = new ArrayDeque<Integer>();
    for (int i = 0; i < weight[0].length; i++) {
      if (queue1.size() >= bridgeLength) {
        onBridge -= queue1.remove();
        onBridge -= queue2.remove();
      }
      onBridge += weight[0][i];
      onBridge += weight[1][i];
      if (onBridge > maxLoad) {
        return i + 1;
      }
    }
    return -1;
  }

  @Test
  public void createProblem() {
    int[][] weight = new int[2][100];
    weight[0] = RandomUtils.newArray(100, 120, 200);
    weight[1] = RandomUtils.newArray(100, 120, 200);
    PrintUtils.print(weight);
    System.out.println("max = " + max(weight, 20));
  }
  
  private int max(int[][] weight, int bridgeLength) {
    int max = 0;
    int onBridge = 0;
    Queue<Integer> queue1 = new ArrayDeque<Integer>();
    Queue<Integer> queue2 = new ArrayDeque<Integer>();
    for (int i = 0; i < weight[0].length; i++) {
      if (queue1.size() >= bridgeLength) {
        onBridge -= queue1.remove();
        onBridge -= queue2.remove();
      }
      onBridge += weight[0][i];
      onBridge += weight[1][i];
      max = Math.max(max, onBridge);
    }

    return max;
  }
}
