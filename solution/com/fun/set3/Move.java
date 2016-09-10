package com.fun.set3;

public class Move {
  private PokemonType type;
  private int damage;

  public Move(PokemonType type, int damage) {
    this.type = type;
    this.damage = damage;
  }

  public PokemonType getType() {
    return type;
  }

  public int getDamage() {
    return damage;
  }
}
