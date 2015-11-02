package com.fun.set1;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class Solution007 extends Problem007 {
  public boolean isSpam(String input, String[] spamWords, int threshold) {
    int count = 0;
    for (String spamWord : spamWords) {
      Pattern pattern = Pattern.compile("\\b" + spamWord + "\\b", Pattern.CASE_INSENSITIVE);
      if (pattern.matcher(input).find()) count++;
    }
    return count >= threshold;
  }
  
  @Test
  public void test() {}
}
