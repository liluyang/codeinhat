package com.fun.set1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * Calculate accumulated music pitch changes. For example,
 * 1 -> 2 -> 3 -> 4 -> 5, the accumulated change is |1-2| + |2-3| + |3-4| + |4-5| = 4.
 * 1 -> 3 -> 5 -> 4 -> 2, the accumulated change is |1-3| + |3-5| + |5-4| + |4-2| = 7.
 * 
 * <ul>
 * <li>music scores is a String of pitches (1~7).
 * <li>assume String is valid.
 * </ul>
 *
 */
public class Problem001 {
  public int solution(String scores) {
    return 0;
  }
  
  @Test
  public void test1() {
    assertEquals(solution("12345"), 4);
  }
  
  @Test
  public void test2() {
    assertEquals(solution("13542"), 7);
  }
  
  @Test
  public void test3() {
    assertEquals(solution("1"), 0);
  }
  
  @Test
  public void test4() {
    assertEquals(solution("11"), 0);
  }
  
  @Test
  public void test5() {
    assertEquals(solution("11223344556677"), 6);
  }
  
  @Test
  public void test6() {
    assertEquals(solution(""), 0);
  }
  
  @Test
  public void testKatyPerryRoarBasic() {
    String roar = "4444444444445574442211177"
        + "7444221117777122427712242"
        + "77712242274442454544224547"
        + "44424544442217774442454";
    assertEquals(solution(roar), 122);
  }
}