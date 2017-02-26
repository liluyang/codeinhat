package com.fun.set3.pokemon;

public class Move {
  private PokemonType type;
  private int damage;
  private double time;

  public Move(PokemonType type, double time, int damage) {
    this.type = type;
    this.time = time;
    this.damage = damage;
  }

  public PokemonType getType() {
    return type;
  }

  public double getTime() {
    return time;
  }

  public int getDamage() {
    return damage;
  }
}
