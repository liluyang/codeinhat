package com.fun.set1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

/**
 * Given an encrypted String and the decrypted result String, it's like you have a dictionary.
 * With another input String, can you decrypt it?
 * 
 * In this problem, only consider english character A-Z, and all Strings are upper-case.
 * 
 * If problem is unsolvable, return null.
 */
public class Problem014 {
  public String decrypt(String encrypted, String decrypted, String input) {
    return "";
  }
  
  @Test
  public void test1() {
    assertEquals(decrypt("ABC", "BCD", "AACC"), "BBDD");
  }
  
  @Test
  public void test2() {
    assertNull(decrypt("ABC", "BCD", "ABCD"), null);
  }
  
  @Test
  public void test3() {
    String encrypted = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String decrypted = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    String input = "GSV JFRXP YILDM ULC QFNKH LEVI GSV OZAB WLT";
    String expected = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    assertEquals(decrypt(encrypted, decrypted, input), expected);
  }
  
  @Test
  public void test4() {
    assertEquals(decrypt("ABC", "XYZ", "A & C = ?"), "X & Z = ?");
  }
}
