package com.fun.set3;

public class TypeUtils {
  public static final double WEAK = 0.8;
  public static final double STRONG = 1.25;
  public static final double NORM = 1.0;

  public static double efficiency(PokemonType type1, PokemonType type2) {
    switch (type1) {
    case Fire:
      if (type2 == PokemonType.Water || type2 == PokemonType.Ground || type2 == PokemonType.Rock) {
        return WEAK;
      } else if (type2 == PokemonType.Grass || type2 == PokemonType.Bug) {
        return STRONG;
      }
      return NORM;

    case Water:
      if (type2 == PokemonType.Electric || type2 == PokemonType.Grass) {
        return WEAK;
      } else if (type2 == PokemonType.Fire || type2 == PokemonType.Ground
          || type2 == PokemonType.Rock) {
        return STRONG;
      }
      return NORM;

    case Grass:
      if (type2 == PokemonType.Fire || type2 == PokemonType.Bug || type2 == PokemonType.Flying
          || type2 == PokemonType.Poison || type2 == PokemonType.Ice) {
        return WEAK;
      } else if (type2 == PokemonType.Water || type2 == PokemonType.Ground
          || type2 == PokemonType.Rock) {
        return STRONG;
      }
      return NORM;

    default:
      return NORM;
    }
  }
}
