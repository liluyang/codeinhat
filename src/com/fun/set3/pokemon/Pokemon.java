package com.fun.set3.pokemon;

public class Pokemon {
  protected PokemonType type;
  protected int cp;
  protected int hp;
  protected Moveset moveset;

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
    // TODO: implement this function
    return false;
  }
}
