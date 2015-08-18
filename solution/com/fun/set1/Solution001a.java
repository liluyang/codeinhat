package com.fun.set1;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Solution001a extends Problem001a {
  private final static int IMPOSSIBLE_LOW = -100;
  @Override
  public int solve(String scores) {
    // 1. Preprocessing scores into normalScores
    List<Integer> normalScores = new ArrayList<Integer>();
    int score = IMPOSSIBLE_LOW;
    for (char c : scores.toCharArray()) {
      if (c > '0' && c < '8') {
        if (score != IMPOSSIBLE_LOW) {
          normalScores.add(score);
        }
        score = c - '0';
      } else if (c == '+') {
        score += 7;
      } else if (c == '-') {
        score -= 7;
      } else {
        // discard char we don't know
      }
    }
    if (score != IMPOSSIBLE_LOW) normalScores.add(score);
    
    // 2. Calculate total pitch difference
    int res = 0;
    for (int i = 0; i < normalScores.size() - 1; i++) {
      res += Math.abs(normalScores.get(i) - normalScores.get(i + 1));
    }
    return res;
  }
  
  @Test
  public void test() {
  }
}
