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
    Pokemon pidgey = new Pokemon("Pidgey", 6, 60, 12);
    assertEquals(maxPoints(pidgey, 100), 35 * 500);
  }

  @Test
  public void test3() {
    Pokemon pidgey = new Pokemon("Pidgey", 1, 11, 12);
    assertEquals(maxPoints(pidgey, 0), 0 * 500);
  }

  @Test
  public void test4() {
    Pokemon pidgey = new Pokemon("Pidgey", 12, 0, 12);
    assertEquals(maxPoints(pidgey, 0), 0 * 500);
  }

  @Test
  public void test5() {
    Pokemon pidgey = new Pokemon("Eevee", 12, 24, 25);
    assertEquals(maxPoints(pidgey, 200), 32 * 500);
  }

  @Test
  public void test6() {
    Pokemon pidgey = new Pokemon("MagiKarp", 85, 85 * 3, 400);
    assertEquals(maxPoints(pidgey, 100), 1 * 500);
  }
}
