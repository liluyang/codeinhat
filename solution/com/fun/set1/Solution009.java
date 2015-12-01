package com.fun.set1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

import org.testng.annotations.Test;

public class Solution009 extends Problem009 {
  @Override
  public int minHops(int[][] connected, int start, int end) {
    int N = connected.length;
    if (N == 0) return 0;
    
    int[][] min = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        min[i][j] = i == j ? 0 : Integer.MAX_VALUE;
      }
    }
    
    Queue<Integer> queue = new ArrayDeque<Integer>();
    queue.add(start);
    
    while (!queue.isEmpty()) {
      int next = queue.remove();
      for (int i = 0; i < N; i++) {
        if (connected[next][i] == 1 && min[start][i] == Integer.MAX_VALUE) {
          min[start][i] = min[start][next] + 1;
          queue.add(i);
        }
      }
    }
    
    return min[start][end] == Integer.MAX_VALUE ? -1 : min[start][end];
  }
  
  @Test
  public void test() {
  }
  
  public void generateTest() {
    int N = 100;
    int[][] connected = new int[N][N];
    Random random = new Random(System.currentTimeMillis());
    int times = random.nextInt(N * (N - 1) / 4);
    for (int i = 0; i < times; i++) {
      int start = random.nextInt(N);
      int end = random.nextInt(N);
      if (start != end) {
        connected[start][end] = 1;
        connected[end][start] = 1;
      }
    }
    
    int start = random.nextInt(N);
    int end = random.nextInt(N);
    System.out.println(start + " --> " + end + " minHops = " + minHops(connected, start, end));
    System.out.print("{");
    for (int i = 0; i < N; i++) {
      System.out.print("{");
      for (int j = 0; j < N; j++) {
        int connect = i == j ? 1 : connected[i][j];
        System.out.print(connect + (j == N - 1 ? "}" : ","));
      }
      System.out.println(i == N - 1 ? "}" : ",");
    }
  }
}
