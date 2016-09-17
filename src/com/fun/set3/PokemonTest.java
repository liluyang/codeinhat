package com.fun.set3;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PokemonTest {
  @Test
  public void test1() {
    Move quick = new Move(PokemonType.Fire, 1.0, 10);
    Move charged = new Move(PokemonType.Fire, 0, 0);
    Moveset moveset = new Moveset(quick, charged);
    Pokemon arcanine1 = new Pokemon(PokemonType.Fire, 1800, 125, moveset);

    Move quick2 = new Move(PokemonType.Fire, 1.0, 10);
    Move charged2 = new Move(PokemonType.Fire, 0, 0);
    Moveset moveset2 = new Moveset(quick2, charged2);
    Pokemon arcanine2 = new Pokemon(PokemonType.Fire, 1800, 125, moveset2);

    assertTrue(arcanine1.defeat(arcanine2));
  }
}
