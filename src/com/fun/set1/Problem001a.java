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
 * <li>there are divider '|' in String, ignore it.
 * </ul>
 *
 */
public class Problem001a extends Problem001 {
  @Override
  public int solve(String scores) {
    // TODO: solve problem here.
    return 0;
  }
  
  @Test
  public void testA() {
    // 8 + 6 + 6 + 8 = 28
    assertEquals(solve("12+34-5"), 28);
  }
  
  @Test
  public void testB() {
    // 9 + 4 + 8 + 5 = 27
    assertEquals(solve("13+54-2"), 27);
  }
  
  @Test
  public void testC() {
    assertEquals(solve("7-1"), 1);
  }
  
  @Test
  public void testD() {
    assertEquals(solve("7+1"), 13);
  }
  
  @Test
  public void testE() {
    assertEquals(solve("1-2-3-4-5-6-7-12345671+2+3+4+5+6+7+"), 20);
  }
  
  @Test
  public void testF() {
    assertEquals(solve("1+"), 0);
  }
  
  @Test
  public void testG() {
    assertEquals(solve("7-"), 0);
  }
  
  @Test
  public void testKatyPerryRoarAdvanced() {
    String roar = "44444444|444455|74+4+4+2+2+1+1+1+77"
        + "74+4+4+2+2+1+1+1+77|771+2+2+4+2+|771+2+2+4+2+"
        + "7771+2+2+4+2+2+7|4+4+4+2+4+5+4+|5+4+4+2+2+4+5+4+7"
        + "4+4+4+2+4+5+4+|4+4+4+2+2+1+777|4+4+4+2+4+5+4+";
    assertEquals(solve(roar), 89);
  }
}
