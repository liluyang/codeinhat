package com.fun.set2;

import java.util.Comparator;
import java.util.PriorityQueue;

import org.testng.annotations.Test;

import com.fun.datastructure.Pokemon;

public class Solution022a extends Problem022a {
  @Override
  public int maxPoints(Pokemon[] pokemons, int balls) {
    int max = 0;
    Comparator<Pokemon> comparator = new Comparator<Pokemon>() {
      @Override
      public int compare(Pokemon a, Pokemon b) {
        return a.ballNeedForEvolve() - b.ballNeedForEvolve();
      }
    };

    PriorityQueue<Pokemon> queue = new PriorityQueue<Pokemon>(pokemons.length, comparator);
    for (Pokemon pokemon : pokemons) {
      queue.add(pokemon);
    }

    while (balls > 0) {
      Pokemon lowNeed = queue.remove();
      if (lowNeed.ballNeedForEvolve() > balls)
        break;
      max += 500;
      balls -= lowNeed.ballNeedForEvolve();
      lowNeed.evolve();
      queue.add(lowNeed);
    }

    return max;
  }

  @Test
  public void test() {
  }
}
