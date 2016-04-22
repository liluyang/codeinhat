package com.fun.set1;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Solution017 extends Problem017 {
  @Override
  public String multiply(String a, String b) {
    ArrayList<Integer> list1 = int2List(a);
    ArrayList<Integer> list2 = int2List(b);
    ArrayList<Integer> res = new ArrayList<Integer>();
    
    for (int i = 0; i < list1.size(); i++) {
      ArrayList<Integer> m = multiply(i, list1.get(i), list2);
      res = add(res, m);
    }
    
    StringBuilder builder = new StringBuilder();
    for (int i : res) {
      builder.append(i);
    }
    return builder.reverse().toString();
  }
  
  private ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
    ArrayList<Integer> res = new ArrayList<Integer>();
    int r = 0;
    int max = Math.max(a.size(), b.size());
    for (int i = 0; i < max; i++) {
      if (i < a.size()) r += a.get(i);
      if (i < b.size()) r += b.get(i);
      res.add(r % 10);
      r /= 10;
    }
    if (r > 0) res.add(r);
    return res;
  }
  
  private ArrayList<Integer> multiply(int shift, int a, ArrayList<Integer> b) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < shift; i++) list.add(0);
    int r = 0;
    for (int i = 0; i < b.size(); i++) {
      r += a * b.get(i);
      list.add(r % 10);
      r /= 10;
    }
    if (r > 0) list.add(r);
    
    for (int i = list.size() - 1; i > 0; i--) {
      if (list.get(i) == 0) {
        list.remove(i);
      } else {
        break;
      }
    }
    
    return list;
  }
  
  private ArrayList<Integer> int2List(String a) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = a.length() - 1; i >= 0; i--) {
      list.add(a.charAt(i) - '0');
    }
    return list;
  }
  
  @Test
  public void test() {
  }
}
