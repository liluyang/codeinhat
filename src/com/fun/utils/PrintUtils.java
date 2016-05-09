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
  
  public final static void within100(String longString) {
    int firstRow = 90;
    int rowMax = 88;
    int L = longString.length();
    if (firstRow > L) {
      System.out.println("\t\"" + longString + "\"");
      return;
    }
    
    int printed = firstRow;
    System.out.println("\t\"" + longString.substring(0, firstRow) + "\"");
    
    while (printed < L) {
      if (printed + rowMax <= L) {
        System.out.println("+ \"" + longString.substring(printed, printed + rowMax) + "\"");
      } else {
        System.out.println("+ \"" + longString.substring(printed, L) + "\"");
      }
      printed += rowMax;
    }
  }
}
