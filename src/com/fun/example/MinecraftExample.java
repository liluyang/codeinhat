package com.fun.example;

public class MinecraftExample {
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
}
