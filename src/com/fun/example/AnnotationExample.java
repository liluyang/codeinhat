package com.fun.example;

import java.io.DataInputStream;
import java.lang.reflect.Method;

public class AnnotationExample {
  public static void main(String[] args) {
    AnnotationExample example = new AnnotationExample();
    try {
      example.parseClass(); 
      System.out.println("\n");
      
      example.runSocialCommands();
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    // Parse java.io.DataInputStream
    example.parseDataInputStream();
  }
  
  private void parseClass() throws Exception {
    Method[] methods = MinecraftExample.class.getMethods();
    int socialCount = 0;
    int magicCount = 0;
    int fightCount = 0;
    for (Method method : methods) {
       if (method.isAnnotationPresent(MinecraftCommand.class)) {
          String groupName = method.getAnnotation(MinecraftCommand.class).groupName();
          if ("fight".equals(groupName)) {
            fightCount++;
          } else if ("magic".equals(groupName)) {
            magicCount++;
          } else if ("social".equals(groupName)) {
            socialCount++;
          } else {
            throw new Exception("Unknow MinecraftCommand groupName: " + groupName);
          }  
       }
    }
    System.out.println("Total fight command = " + fightCount);
    System.out.println("Total magic command = " + magicCount);
    System.out.println("Total social command = " + socialCount);
  }
  
  private void runSocialCommands() {
    MinecraftExample me = new MinecraftExample();
    me.setUser("Winston");
    
    for (Method method : MinecraftExample.class.getMethods()) {
      if (method.isAnnotationPresent(MinecraftCommand.class)) {
        String groupName = method.getAnnotation(MinecraftCommand.class).groupName();
        if ("social".equals(groupName)) {
          try {
            method.invoke(me);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
  
  private void parseDataInputStream() {
    Method[] methods = DataInputStream.class.getMethods();
    int count = 0;
    for (Method method : methods) {
      if (method.isAnnotationPresent(Deprecated.class)) {
        count++;
      }
    }
    System.out.println("There are " + count + " overriden methods.");
  }
}
