package com.fun.set1;

import static org.testng.Assert.assertEquals;

import java.util.SortedMap;
import java.util.TreeMap;

import org.testng.annotations.Test;

/**
 * Baron Munchausen is set to catch ducks with bacon. Given a duck-eat-bacon chart in a hashmap:
 * weight1 -> amount1
 * weight2 -> amount2
 * ...
 * weightN -> amountN
 * 
 * That means, if duck's weight is less than weight1 (not include weight1), it will eat amount1 of
 * bacon; if duckt's weight is between weight1 and weight2 (not include weight2), it will eat
 * amount2 of bacon, etc.
 *
 * Given ducks weight array, can you tell me how much bacon Baron needs to catch all ducks?
 */
public class Problem003 {
  private final static double EPSILON = 1e-8;
  
  public double solve(SortedMap<Double, Double> baconChart, double[] duckWeight) {
    // TODO: your solution here.
    return 0;
  }
  
  @Test
  public void test1() {
    assertEquals(solve(testMap1(), new double[] { 1.0, 1.5, 2.0, 2.5 }), 2.9, EPSILON);
  }

  @Test
  public void test2() {
    assertEquals(solve(testMap1(), new double[] { 1.5, 2.0, 1.0, 2.5 }), 2.9, EPSILON);
  }

  @Test
  public void test3() {
    assertEquals(
        solve(testMap1(), new double[] { 0.9, 1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9,
            2.0, 2.1, 2.2, 2.3, 2.4, 2.5, 2.6 }), 12.6, EPSILON);
  }
  
  @Test
  public void test4() {
    double[] weight = new double[30];
    for (int i = 0; i < 15; i++) {
      weight[2 * i] = 1.0 + i * 0.1;
      weight[2 * i + 1] = 1.2 + i * 0.9;
    }
    assertEquals(
        solve(testMap2(), weight), 17.82, EPSILON);
  }

  private SortedMap<Double, Double> testMap1() {
    SortedMap<Double, Double> map = new TreeMap<Double, Double>();
    map.put(1.0, 0.5);
    map.put(1.5, 0.6);
    map.put(2.0, 0.7);
    map.put(10.0, 0.8);
    return map;
  }
  
  private SortedMap<Double, Double> testMap2() {
    SortedMap<Double, Double> map = new TreeMap<Double, Double>();
    map.put(1.0, 0.5);
    map.put(1.5, 0.56);
    map.put(2.0, 0.7);
    map.put(2.5, 0.76);
    map.put(10.0, 0.8);
    return map;
  }
}
