package com.fun.set1;

import java.awt.image.BufferedImage;
import java.util.HashMap;

import org.testng.annotations.Test;

public class Solution004 extends Problem004 {
  public int solve(BufferedImage image) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int x = 0; x < image.getWidth(); x++) {
      for (int y = 0; y < image.getHeight(); y++) {
        int rgb = image.getRGB(x, y);
        if (!map.containsKey(rgb)) {
          map.put(rgb, 1);
        } else {
          map.put(rgb, map.get(rgb) + 1);
        }
      }
    }
    
    int maxRGB = 0;
    int maxCount = -1;
    for (int rgb : map.keySet()) {
      if (map.get(rgb) > maxCount) {
        maxCount = map.get(rgb);
        maxRGB = rgb;
      }
    }
    
    System.out.println("maxRGB = " + Integer.toHexString(maxRGB) + ", count = " + maxCount);
    return maxRGB;
  }
  
  @Test
  public void test() {
  }
}
