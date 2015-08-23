package com.fun.utils;

public class PrintUtils {
  public final static void print(int[][] a) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < a.length; i++) {
      builder.append("{");
      for (int j = 0; j < a[0].length; j++) {
        builder.append(j == 0 ? a[i][j] : "," + a[i][j]);
      }
      builder.append("}");
      builder.append(i == a.length - 1 ? "\n" : ",\n");
    }
    System.out.println(builder.toString());
  }
}
