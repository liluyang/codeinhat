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
      if (c >= 'A' && c <= 'Z') {
        if (!dictionary.containsKey(c)) return null;
        builder.append(dictionary.get(c));
      } else {
        builder.append(c);
      }
    }
    return builder.toString();
  }
  
  public String encrypt(String encrypted, String decrypted, String input) {
    HashMap<Character, Character> dictionary = new HashMap<Character, Character>();
    for (int i = 0; i < decrypted.length(); i++) {
      dictionary.put(decrypted.charAt(i), encrypted.charAt(i));
    }
    
    StringBuilder builder = new StringBuilder();
    for (char c : input.toCharArray()) {
      if (c >= 'A' && c <= 'Z') {
        builder.append(dictionary.get(c));
      } else {
        builder.append(c);
      }
    }
    return builder.toString();
  }
  
  @Test
  public void test() {
    String encrypted = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String decrypted = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    System.out.println(encrypt(encrypted, decrypted, input));
  }
}
