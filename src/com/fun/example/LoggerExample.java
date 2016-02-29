package com.fun.example;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {
  private Logger logger;
  
  public static void main(String[] args) {
    LoggerExample example = new LoggerExample();
    example.run();
  }
  
  private void run() {
    System.out.println("First example, create a log with different levels");
    exampleLog();
    printGap();
    
    System.out.println("Second example, create a log at level WARNING");
    exampleLogAtWarningLevel();
    printGap();
    
    System.out.println("Third example, create a log at file data/log/loggerExample.log");
    exampleLogInFile();
  }
  
  private void printGap() {
    for (int i = 0; i < 3; i++) System.out.println();
  }
  
  private void exampleLog() {
    logger = Logger.getLogger("My First Logger");
    logMessages();
  }
  
  private void exampleLogAtWarningLevel() {
    logger = Logger.getLogger("My Second Logger");
    logger.setLevel(Level.WARNING);
    logMessages();
  }
  
  private void exampleLogInFile() {
    logger = Logger.getLogger("My Third Logger");
    try {
      logger.addHandler(new FileHandler("data/log/loggerExample.log"));
      logMessages();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private void logMessages() {  
    // Log a severe message
    logger.log(Level.SEVERE, "System overload, no response!");
    
    // Another way to log severe message
    logger.severe("Watch out, system is going to reboot because running out of power!");
    
    // Log a warning message
    logger.log(Level.WARNING, "Wrong password, please try again!");
    
    // Another way to log warning message
    logger.warning("User name doesn't match, please try again!");
    
    // Log an info message
    logger.log(Level.INFO, "Allocate memory 32M...");
    
    // Another way to log info message
    logger.info("Current connected user count is 32154.");
    
    // Log a config message
    logger.log(Level.CONFIG, "Camera detected.");
    
    // Another way to log config message
    logger.config("Speaker volume changed to 32.");
    
    // Log a fine message
    logger.log(Level.FINE, "User paused the video.");
    
    // Another way to log fine message
    logger.fine("User resume video at 13:01:23.");
  }
}
