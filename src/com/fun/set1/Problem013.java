package com.fun.set1;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

/**
 * How to crash JVM with OutOfMemoryError? Write program to create OutOfMemoryError with following
 * ways:
 * 1. create too many objects
 * 2. create too many threads
 * 3. allocate too many arrays
 */
public class Problem013 {
  public void generateError() {
    // TODO: create OutOfMemoryError
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
