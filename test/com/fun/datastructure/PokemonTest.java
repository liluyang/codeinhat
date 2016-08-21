package com.fun.datastructure;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PokemonTest {
  @Test
  public void testBallNeedForEvolve() {
    Pokemon pidgey = new Pokemon("Pidgey", 0, 0, 12);
    assertEquals(pidgey.ballNeedForEvolve(), 4);
  }

  @Test
  public void testBallNeedForEvolve2() {
    Pokemon rattata = new Pokemon("Rattata", 0, 0, 25);
    assertEquals(rattata.ballNeedForEvolve(), 7);
  }

  @Test
  public void testBallNeedForEvolve3() {
    Pokemon paras = new Pokemon("Paras", 0, 0, 50);
    assertEquals(paras.ballNeedForEvolve(), 13);
  }

  @Test
  public void testBallNeedForEvolve4() {
    Pokemon pidgey = new Pokemon("Pidgey", 1, 11, 12);
    assertEquals(pidgey.ballNeedForEvolve(), 1);
  }

  @Test
  public void testBallNeedForEvolve5() {
    Pokemon pidgey = new Pokemon("Pidgey", 1, 12, 12);
    assertEquals(pidgey.ballNeedForEvolve(), 0);
  }

  @Test
  public void testBallNeedForEvolve6() {
    Pokemon pidgey = new Pokemon("Pidgey", 2, 11, 12);
    assertEquals(pidgey.ballNeedForEvolve(), 0);
  }

  @Test
  public void testEvolve1() {
    Pokemon pidgey = new Pokemon("Pidgey", 0, 0, 12);
    pidgey.evolve();
    assertEquals(pidgey.getCaught(), 3);
    assertEquals(pidgey.getCandy(), 0);
  }

  @Test
  public void testEvolve2() {
    Pokemon pidgey = new Pokemon("Pidgey", 2, 11, 12);
    pidgey.evolve();
    assertEquals(pidgey.getCaught(), 0);
    assertEquals(pidgey.getCandy(), 0);
  }
}
