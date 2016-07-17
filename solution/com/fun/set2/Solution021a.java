package com.fun.set2;

import org.testng.annotations.Test;

public class Solution021a extends Problem021a {
  public int height(int[] imageHeights) {
    int left = 0; 
    int right = 0;
    
    for (int imageHeight : imageHeights) {
      if (left <= right) {
        left += imageHeight;
      } else {
        right += imageHeight;
      }
    }
    
    return Math.max(left, right);
  }
  
  @Test
  public void test() {
  }
}
