package com.fun.set2;

import org.testng.annotations.Test;

public class Solution028 extends Problem028 {
  @Override
  public int[] numStream(int[] a) {
    int[] res = new int[2];
    int last = a[0];
    int count = 1;
    for (int i = 1; i < a.length; i++) {
      if (a[i] == last) {
        count++;
      } else {
        if (count > res[1]) {
          res[0] = last;
          res[1] = count;
        }
        last = a[i];
        count = 1;
      }
    }

    if (count > res[1]) {
      res[0] = last;
      res[1] = count;
    }

    return res;
  }

  @Test
  public void test() {

  }
}
