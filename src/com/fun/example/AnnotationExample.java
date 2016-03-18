package com.fun.example;

import java.lang.reflect.Method;

public class AnnotationExample {
  private String user;
  
  public void setUser(String user) {
    this.user = user;
  }
  
  @MinecraftCommand(groupName="social")
  public void sayHello() {
    System.out.println("Hello, " + user);
  }
  
  @MinecraftCommand(groupName="magic")
  public void changeToARabbit() {
    System.out.println("Fi Fi Fo Fo, " + user + ", you are turning into a white rabbit now!");
  }
  
  @MinecraftCommand(groupName="fight")
  public void weakenEnemy() {
    System.out.println(user + ": you weaken opponent's level by 1");
  }
  
  @MinecraftCommand(groupName="fight")
  public void defeat() {
    System.out.println(user + ": you have defeated your oponent!");
  }
  
  @MinecraftCommand
  public void goodBye() {
    System.out.println("Goodbye, " + user);
  }
  
  @MinecraftCommand(groupName="magic")
  public void fly() {
    System.out.println(user + ": you are flying like Kiki!");
  }
  
  public static void main(String[] args) {
    AnnotationExample example = new AnnotationExample();
    try {
      example.parseClass(); 
      System.out.println("\n");
      
      example.setUser("Winston");
      example.runSocialCommands();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private void parseClass() throws Exception {
    Method[] methods = AnnotationExample.class.getMethods();
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
    for (Method method : AnnotationExample.class.getMethods()) {
      if (method.isAnnotationPresent(MinecraftCommand.class)) {
        String groupName = method.getAnnotation(MinecraftCommand.class).groupName();
        if ("social".equals(groupName)) {
          try {
            method.invoke(this);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
