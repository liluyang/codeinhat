package com.fun.utils;

/**
 * Utilities to manipulate String.
 */
public class StringUtils {
  public final static String toString(int[] array) {
    StringBuilder builder = new StringBuilder();
    for (int i : array) {
      builder.append(",");
      builder.append(i);
    }
    return builder.length() > 0 ? builder.substring(1) : "";
  }
}
