package com.fun.set2;

import org.testng.annotations.Test;

public class Problem022 {
  public int maxPoints(Pokemon[] pokemons, int balls) {
    return 0;
  }

  @Test
  public void test1() {

  }

  private class Pokemon {
    String name;
    int caught;
    int candy;
    int candyForEvolve;

    public Pokemon(String name, int caught, int candy, int candyForEvolve) {
      this.name = name;
      this.caught = caught;
      this.candy = candy;
      this.candyForEvolve = candyForEvolve;
    }
  }
}
