package com.fun.set1;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Solution013 extends Problem013 {
  @Override
  public void generateError() {
    createTooManyObjects();
    //allocateTooMuchArray();
    //runTooManyThreads();
  }
  
  public void createTooManyObjects() {
    ArrayList<TestObj> objs = new ArrayList<TestObj>();
    while (true) {
      objs.add(new TestObj());
    }
  }
  
  private class TestObj {
    private int[] list;
    public TestObj() {
      this.list = new int[1024000];
    }
  }
  
  public void allocateTooMuchArray() {
    int[][] a = new int[1024][];
    int N = 4096000;
    for (int i = 0; i < 1024; i++) {
      a[i] = new int[N];
    }
  }
  
  public void runTooManyThreads() {
    int i = 0;
    while (true) {
      new Thread(new Runnable() {
        public void run() {
          try {
            Thread.sleep(1000000);
          } catch (InterruptedException e) {}
        }
      }).start();
      System.out.println(i++);
    }
  }
  
  @Test
  public void test() {
    // dummy
  }
}
