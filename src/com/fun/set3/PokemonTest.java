package com.fun.set3;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PokemonTest {
  @Test
  public void test1() {
    Move quick = new Move(PokemonType.Fire, 1.0, 10);
    Move charged = new Move(PokemonType.Fire, 4.0, 0);
    Moveset moveset = new Moveset(quick, charged);
    Pokemon arcanine1 = createPokemon(PokemonType.Fire, 1800, 125, moveset);

    Move quick2 = new Move(PokemonType.Fire, 1.5, 15);
    Move charged2 = new Move(PokemonType.Fire, 4.0, 0);
    Moveset moveset2 = new Moveset(quick2, charged2);
    Pokemon arcanine2 = createPokemon(PokemonType.Fire, 1800, 128, moveset2);

    assertTrue(arcanine1.defeat(arcanine2));
  }

  @Test
  public void test2() {
    Move quick = new Move(PokemonType.Fire, 0.84, 10);
    Move charged = new Move(PokemonType.Fire, 4.1, 100);
    Moveset moveset = new Moveset(quick, charged);
    Pokemon arcanine1 = createPokemon(PokemonType.Fire, 1800, 100, moveset);

    Move quick2 = new Move(PokemonType.Fire, 0.5, 6);
    Move charged2 = new Move(PokemonType.Fire, 2.9, 55);
    Moveset moveset2 = new Moveset(quick2, charged2);
    Pokemon arcanine2 = createPokemon(PokemonType.Fire, 2000, 140, moveset2);

    assertFalse(arcanine1.defeat(arcanine2));
  }

  private Pokemon createPokemon(PokemonType type, int cp, int hp, Moveset moveset) {
    return new PokemonSolution(type, cp, hp, moveset);
  }
}
