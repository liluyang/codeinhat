package com.fun.set2;

import org.testng.annotations.Test;

import com.fun.datastructure.Pokemon;

public class Solution022 extends Problem022 {
  @Override
  public int maxPoints(Pokemon pokemon, int balls) {
    // 1. Catach pokemon with balls
    int caught = pokemon.getCaught() + balls;

    // 2. Evolve max number of pokemons
    int evolved = caught / pokemon.getCandyForEvolve();
    caught -= evolved;

    return 0;
  }

  @Test
  public void test() {
  }
}
