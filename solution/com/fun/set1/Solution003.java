package com.fun.set1;

import java.util.SortedMap;

import org.testng.annotations.Test;

public class Solution003 extends Problem003 {
  public double solve(SortedMap<Double, Double> baconChart, double[] duckWeights) {
    double res = 0.0;
    for (double duckWeight : duckWeights) {
      res += calcBacon(duckWeight, baconChart);
    }
    return res;
  }

  private double calcBacon(double weight, SortedMap<Double, Double> baconChart) {
    for (Double key : baconChart.keySet()) {
      if (weight < key) {
        return baconChart.get(key);
      }
    }
    return 0.0;
  }
  
  @Test
  public void test() {
  }
}
