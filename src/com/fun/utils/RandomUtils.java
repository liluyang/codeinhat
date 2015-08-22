package com.fun.utils;

import java.util.Random;

/**
 * Utilities to generate random numbers.
 */
public class RandomUtils {
  private static Random random = new Random(System.currentTimeMillis());
  /**
   * Generate random int array in range of [lower, upper).
   */
  public final static int[] newArray(int size, int lower, int upper) {
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = lower + random.nextInt(upper - lower);
    }
    return array;
  }
}
