package com.fun.set1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class Solution005 extends Problem005 {
  public int countAngry(String fullText, String[] synonyms) {
    StringBuilder builder = new StringBuilder();
    for (String synonym : synonyms) {
      builder.append("|" + synonym);
    }
    Pattern pattern = Pattern.compile(builder.substring(1), Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(fullText);
    int count = 0;
    while (matcher.find()) count++;
    return count;
  }
  
  @Test
  public void test() {
  }
}
