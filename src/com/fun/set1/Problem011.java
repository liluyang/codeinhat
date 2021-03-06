package com.fun.set1;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

/**
 * Tree age can be calculated from annual ring. Given a 0/1 string, represents a line across the
 * diameter of tree. 0 is dark area, 1 is light area.Write a program to count how old is the tree. 
 */
public class Problem011 {
  public int age(String treeLine) {
    return 0;
  }

  @Test
  public void test1() {
    assertEquals(age("0"), 1);
  }

  @Test
  public void test2() {
    assertEquals(age("00"), 1);
  }

  @Test
  public void test3() {
    assertEquals(age("101"), 1);
  }

  @Test
  public void test4() {
    assertEquals(age("1010"), 1);
  }

  @Test
  public void test5() {
    assertEquals(age("01010"), 2);
  }

  @Test
  public void test6() {
    assertEquals(age("0101010101010110011001100110"), 6);
  }

  @Test
  public void test7() {
    assertEquals(age("010011000011110101100101110010101011100110011100101"), 8);
  }

  @Test
  public void test8() {
    assertEquals(age("101001011111001111001101011011111110011000001010010110000100010001100000011"
        + "0011000101100100100111000"), 12);
  }
  
  @Test
  public void test9() {
    assertEquals(age("010001100101110010001011110110010010010101101100001000100100110110111000000"
        + "10100011011111111010000011110101010000101001010001100000100100100010110101001111011010"
        + "01001100001001100110101000001001010110001010100111001001111010111001110101011101001000"
        + "11101101011010011111011111001101011110010111000001110001111000110011110101000100101001"
        + "00011110100010010100100011010110010111000001010001001010100010110101001101011101010010"
        + "11100100001001101010111001001110011001110101110100110011010111111000000111011011"), 70);
  }
}
