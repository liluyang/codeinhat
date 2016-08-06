package com.fun.set2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.fun.datastructure.Pokemon;

public class Problem022 {
  public int maxPoints(Pokemon pokemon, int balls) {
    return 0;
  }

  @Test
  public void test1() {
    Pokemon pidgey = new Pokemon("Pidgey", 0, 0, 12);
    assertEquals(maxPoints(pidgey, 100), 30 * 500);
  }

  @Test
  public void test2() {

  }
}
