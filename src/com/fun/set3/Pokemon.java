package com.fun.set3;

public class Pokemon {
  private PokemonType type;
  private int cp;
  private int hp;
  private Moveset moveset;

  public Pokemon(PokemonType type, int cp, int hp, Moveset moveset) {
    this.type = type;
    this.cp = cp;
    this.hp = hp;
    this.moveset = moveset;
  }

  public int getCP() {
    return cp;
  }

  public int getHP() {
    return hp;
  }

  public PokemonType getType() {
    return type;
  }

  public Moveset getMoveset() {
    return moveset;
  }

  public boolean defeat(Pokemon another) {
    // TODO(winston): implement this function
    return false;
  }
}
