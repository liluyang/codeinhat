package com.fun.datastructure;

public class Pokemon {
  private String name;
  private int caught;
  private int candy;
  private int candyForEvolve;

  public Pokemon(String name, int caught, int candy, int candyForEvolve) {
    this.name = name;
    this.caught = caught;
    this.candy = candy;
    this.candyForEvolve = candyForEvolve;
  }

  public String getName() {
    return name;
  }

  public int getCaught() {
    return caught;
  }

  public int getCandy() {
    return candy;
  }

  public int getCandyForEvolve() {
    return candyForEvolve;
  }

  public int ballNeedForEvolve() {
    return caught == 0 ? 1 + ballNeedForEvolve(1, candy + 3) : ballNeedForEvolve(caught, candy);
  }

  private int ballNeedForEvolve(int caught, int candy) {
    int candyNeed = candyForEvolve - (candy + caught - 1);
    return candyNeed <= 0 ? 0 : (candyNeed + 3) / 4;
  }

  public void evolve() {
    // At least one pokemon need for evolve.
    if (caught == 0) {
      caught = 1;
      candy += 3;
    }

    // Catch minimum pokemon to satisfy candy need.
    int ballNeed = ballNeedForEvolve(caught, candy);
    caught += ballNeed;
    candy += ballNeed * 3;

    // Evolve
    caught--;
    if (candy >= candyForEvolve) {
      candy -= candyForEvolve;
    } else {
      caught -= candyForEvolve - candy;
      candy = 0;
    }
  }
}
