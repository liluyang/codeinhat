package com.fun.set1;

import static org.testng.Assert.fail;

import java.util.ArrayList;

import org.testng.annotations.Test;

/**
 * How to crash JVM with OutOfMemoryError? Write program to create OutOfMemoryError with following
 * ways:
 * 1. create too many objects
 * 2. create too many threads
 * 3. allocate too many arrays
 */
public class Problem013 {
  /*public void generateError() {
    // TODO: create OutOfMemoryError
    testRun();
  }*/
  
  public void generateError() {
    ArrayList<TestObj> a = new ArrayList<TestObj>();
    while (true) {
        TestObj crash = new TestObj();
        a.add(crash);
    }
  }
  
  private class TestObj {
    private int[] list;
    public TestObj() {
      this.list = new int[1024000];
    }
  }
  
  @Test
  public void testOutOfMemoryError() {
    try {
      generateError();
      fail("Didn't catch error OOM");
    } catch (OutOfMemoryError e) {
      System.out.println("Catch error successfully!");
    }
  }
}
