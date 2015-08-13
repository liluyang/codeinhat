package com.fun.set1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Calculate accumulated music pitch changes. For example,
 * 1 -> 2+ -> 3 -> 4- -> 5, the accumulated change is 28.
 * 1 -> 3+ -> 5 -> 4- -> 2, the accumulated change is 27.
 * 
 * <ul>
 * <li>music scores is a String of pitches (1~7).
 * <li>assume String is valid.
 * </ul>
 *
 */
public class Problem001a extends Problem001 {
  @Test
  public void testA() {
    // 8 + 6 + 6 + 8 = 28
    assertEquals(solution("12+34-5"), 28);
  }
  
  @Test
  public void testB() {
    // 9 + 4 + 8 + 5 = 27
    assertEquals(solution("13+54-2"), 27);
  }
  
  @Test
  public void testC() {
    assertEquals(solution("7-1"), 1);
  }
  
  @Test
  public void testD() {
    assertEquals(solution("7+1"), 13);
  }
  
  @Test
  public void testE() {
    assertEquals(solution("1-2-3-4-5-6-7-12345671+2+3+4+5+6+7+"), 20);
  }
  
  @Test
  public void testF() {
    assertEquals(solution("1+"), 0);
  }
  
  @Test
  public void testG() {
    assertEquals(solution("7-"), 0);
  }
  
  @Test
  public void testKatyPerryRoarAdvanced() {
    String roar = "";
    assertEquals(solution(roar), 0);
  }
}
