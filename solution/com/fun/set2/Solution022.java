package com.fun.set2;

import org.testng.annotations.Test;

import com.fun.datastructure.Pokemon;

public class Solution022 extends Problem022 {
  @Override
  public int maxPoints(Pokemon pokemon, int balls) {
    int N = pokemon.getCandyForEvolve();

    // 1. Catach pokemon with balls.
    int caught = pokemon.getCaught() + balls;
    int candy = pokemon.getCandy() + balls * 3;

    // 2. Transfer and evolve as much as possible.
    int evolved = Math.min(caught, (caught + candy) / (N + 1));

    return evolved * 500;
  }

  @Test
  public void test() {
  }
}
