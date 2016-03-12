package com.fun.set1;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Solution015 extends Problem015 {
  public int lastElement(int M, int N) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 1; i <= M; i++) list.add(i);
//    long t1 = System.currentTimeMillis();
    
    int next = 0;
    for (int i = 1; i < M; i++) {
//      if (i % 10000 == 0) {
//        long t2 = System.currentTimeMillis();
//        System.out.println(i + ", " + (t2 - t1));
//        t1 = t2;
//      }
      next = (next + N - 1) % list.size();
      list.remove(next);
    }
    
    return list.get(0);
  }
  
  public int lastElement2(int M, int N) {
    int[] a = new int[M];
    for (int i = 0; i < M; i++) a[i] = i + 1;
    int start = 0;
    for (int i = 1; i < M; i++) {
      int j = N;
      while (true) {
        while (a[start] == 0) {
          start = (start + 1) % M;
        }
        if (--j > 0) {
          start = (start + 1) % M;
        } else {
          a[start] = 0;
          break;
        }
      }
    }
    
    for (int i = 0; i < M; i++) {
      if (a[i] > 0) return a[i];
    }
    return 0;
  }
  
  @Test
  public void test() {   
  }
}
