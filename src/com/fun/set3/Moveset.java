package com.fun.set3;

public class Moveset {
  private Move quick;
  private Move charged;

  public Moveset(Move quick, Move charged) {
    this.quick = quick;
    this.charged = charged;
  }

  public Move getQuick() {
    return quick;
  }

  public Move getCharged() {
    return charged;
  }
}
