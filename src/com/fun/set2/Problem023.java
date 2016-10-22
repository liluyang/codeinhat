package com.fun.set2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Problem023 {
  public int walkNeed(String[] data) {
    return 0;
  }

  @Test
  public void test1() {
    String[] data = new String[] { "Dratini", "5", "17", "25", "100", "#" };
    assertEquals(walkNeed(data), 535);
  }

  @Test
  public void test2() {
    String[] data = new String[] { "Slowpoke", "3", "50", "50", "#" };
    assertEquals(walkNeed(data), 0);
  }

  @Test
  public void test3() {
    String[] data = new String[] { "Pidgey", "1", "210", "12", "50", "#" };
    assertEquals(walkNeed(data), 0);
  }
}
