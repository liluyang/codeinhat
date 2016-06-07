package com.fun.set2;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Solution021 extends Problem021 {
  @Override
  public int[] imagesOnScreen(int screenHeight, int[] imageHeights, int[] moves) {
    int N = imageHeights.length;
    int[] top = new int[N];
    int[] bottom = new int[N];
    int leftUsed = 0;
    int rightUsed = 0;
    
    for (int i = 0; i < N; i++) {
      if (leftUsed <= rightUsed) {
        top[i] = leftUsed;
        bottom[i] = leftUsed + imageHeights[i];
        leftUsed += imageHeights[i];
      } else {
        top[i] = rightUsed;
        bottom[i] = rightUsed + imageHeights[i];
        rightUsed += imageHeights[i];
      }
    }
    
    int maxBottom = Math.max(leftUsed, rightUsed);
    int maxScroll = Math.max(0, maxBottom - screenHeight);
    
    int screenTop = 0;
    for (int move : moves) {
      if (move >= 0) {
        screenTop = Math.min(screenTop + move, maxScroll);
      } else {
        screenTop = Math.max(screenTop + move, 0);
      }
    }
    
    ArrayList<Integer> res = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      if (top[i] < screenTop + screenHeight && bottom[i] > screenTop) {
        res.add(i);
      }
    }
    
    int[] a = new int[res.size()];
    for (int i = 0; i < res.size(); i++) a[i] = res.get(i);
    return a;
  }
  
  @Test
  public void test() {
  }
}