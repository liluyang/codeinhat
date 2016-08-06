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

  public int candyNeed() {
    return candyForEvolve - candy % candyForEvolve;
  }
}
