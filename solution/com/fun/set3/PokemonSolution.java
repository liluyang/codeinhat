package com.fun.set3;

import com.fun.set3.pokemon.Moveset;
import com.fun.set3.pokemon.Pokemon;
import com.fun.set3.pokemon.PokemonType;

public class PokemonSolution extends Pokemon {
  public PokemonSolution(PokemonType type, int cp, int hp, Moveset moveset) {
    super(type, cp, hp, moveset);
  }

  @Override
  public boolean defeat(Pokemon another) {
    double t1 = defeatTime(moveset, another.getHP());
    double t2 = defeatTime(another.getMoveset(), hp);
    System.out.println("Pokemon 1 defeat 2 need " + t1);
    System.out.println("Pokemon 2 defeat 1 need " + t2);
    return t1 <= t2;
  }

  private double defeatTime(Moveset moveset, int hp) {
    double quickTime = moveset.getQuick().getTime();
    int quickDamage = moveset.getQuick().getDamage();
    double chargedTime = moveset.getCharged().getTime();
    int chargedDamage = moveset.getCharged().getDamage();

    double nextQuick = quickTime;
    double nextCharged = chargedTime;
    int remainHp = hp;
    double time = 0;
    while (remainHp > 0) {
      time = Math.min(nextQuick, nextCharged);
      if (withinTime(time, nextQuick)) {
        remainHp -= quickDamage;
        nextQuick += quickTime;
      }
      if (withinTime(time, nextCharged)) {
        remainHp -= chargedDamage;
        nextCharged += chargedTime;
      }
    }
    return time;
  }

  private boolean withinTime(double time1, double time2) {
    return Math.abs(time1 - time2) < 1e-5;
  }
}
