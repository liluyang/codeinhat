package com.fun.set1;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Solution014 extends Problem014 {
  public String decrypt(String encrypted, String decrypted, String input) {
    HashMap<Character, Character> dictionary = new HashMap<Character, Character>();
    for (int i = 0; i < encrypted.length(); i++) {
      dictionary.put(encrypted.charAt(i), decrypted.charAt(i));
    }
    
    StringBuilder builder = new StringBuilder();
    for (char c : input.toCharArray()) {
      if (!dictionary.containsKey(c)) return null;
      builder.append(dictionary.get(c));
    }
    return builder.toString();
  }
  
  @Test
  public void test() {
    
  }
}
