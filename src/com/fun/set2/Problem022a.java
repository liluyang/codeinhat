package com.fun.set2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.fun.datastructure.Pokemon;

public class Problem022a {
  public int maxPoints(Pokemon[] pokemons, int balls) {
    return 0;
  }

  @Test
  public void test1() {
    Pokemon pidgey = new Pokemon("Pidgey", 0, 0, 12);
    Pokemon rattata = new Pokemon("Rattata", 0, 0, 25);
    Pokemon paras = new Pokemon("Paras", 0, 0, 50);
    assertEquals(maxPoints(new Pokemon[] { pidgey, rattata, paras }, 100), 30 * 500);
  }

  @Test
  public void test2() {
    Pokemon pidgey = new Pokemon("Pidgey", 0, 0, 12);
    Pokemon rattata = new Pokemon("Rattata", 12, 24, 25);
    assertEquals(maxPoints(new Pokemon[] { pidgey, rattata }, 100), 31 * 500);
  }

  @Test
  public void test3() {
    Pokemon magikarp = new Pokemon("MagiKarp", 85, 85 * 3, 400);
    assertEquals(maxPoints(new Pokemon[] { magikarp }, 100), 500);
  }

  @Test
  public void test4() {
    Pokemon pidgey = new Pokemon("Pidgey", 0, 0, 12);
    Pokemon rattata = new Pokemon("Rattata", 12, 24, 25);
    Pokemon magikarp = new Pokemon("MagiKarp", 85, 85 * 3, 400);
    assertEquals(maxPoints(new Pokemon[] { pidgey, rattata, magikarp }, 100), 31 * 500);
  }
}
