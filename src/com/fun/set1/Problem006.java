package com.fun.set1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

/**
 * Paint as your will. This problem doesn't have an answer. You can paint anything you want by
 * implementing getRGB(int x, int y).
 * 
 * (x, y) is the coordinate, returns a color expressed by integer. i.e. a red value (0~255), a
 * green value (0~255), and a blue value (0~255), shuffle them in one integer as:
 * (red << 16) | (green << 8) | blue
 * 
 * This program gives you choices of 0~3 in console input:
 * 0: your implementation (if you don't change, it is a black image)
 * 1: Martin Buttner's work
 * 2. Mandelbrot set image
 * 3. Mandelbrot set image in a local area.
 */
public class Problem006 {
  private BufferedImage image;
  
  private class Solution extends Painter {
    @Override
    public int getSize() {
      return 512;
    }
    
    @Override
    public int getRGB(int x, int y) {
      // TODO: calculate red, green, blue based on (x,y) and return an integer.
      int red = 0;
      int green = 0;
      int blue = 0;
      return (red << 16) | (green << 8) | blue;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Choose a picture[0-4]: ");
    String input = scanner.next();
    scanner.close();
    int choice = Integer.parseInt(input);
    if (choice < 0 || choice >= 5) choice = 0;
    new Problem006().run(choice);
  }

  private void run(int choice) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
    Painter painter = getPainter(choice);
    buildImage(painter);
    
    ImagePanel imagePanel = new ImagePanel();
    imagePanel.setSize(painter.getSize(), painter.getSize());
    imagePanel.setPreferredSize(new Dimension(720, 720));
    JScrollPane scrPane = new JScrollPane(imagePanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    frame.setContentPane(scrPane);
    
    frame.setSize(painter.getSize(), painter.getSize());
    frame.setVisible(true);
  }

  private void buildImage(Painter painter) {
    image = new BufferedImage(painter.getSize(), painter.getSize(), BufferedImage.TYPE_INT_RGB);
    for (int x = 0; x < painter.getSize(); x++) {
      for (int y = 0; y < painter.getSize(); y++) { 
        image.setRGB(x, y, painter.getRGB(x, y));
      }
    }
  }
  
  private Painter getPainter(int choice) {
    switch (choice) {
    case 1:
      return new MartinButtner();
    case 2:
      return new Mandelbrot();
    case 3:
      return new Mandelbrot2();
    case 4:
      return new Hyperbola();
    default:
      return new Solution();
    }
  }
  
  private int getByte(double x) {
    return 0xff & (int) x;
  }

  private double square(double x) {
    return x * x;
  }
  
  private class Painter {
    public int getSize() {
      return 1024;
    }
    
    public int getRGB(int x, int y) {
      return 0;
    }
  }
  
  private class MartinButtner extends Painter {
    @Override
    public int getSize() {
      return 512;
    }
    
    @Override
    public int getRGB(int x, int y) {
      int red = getByte(square(Math.cos(Math.atan2(y - 256, x - 256) / 2)) * 255);
      int green = getByte(
          square(Math.cos(Math.atan2(y - 256, x - 256) / 2 - 2 * Math.acos(-1) / 3)) * 255);
      int blue = getByte(
          square(Math.cos(Math.atan2(y - 256, x - 256) / 2 + 2 * Math.acos(-1) / 3)) * 255);
      return (red << 16) | (green << 8) | blue;
    }
  }
  
  private class Mandelbrot extends Painter {
    public int getSize() {
      return 600;
    }
    
    @Override
    public int getRGB(int i, int j) {
      double x = 0;
      double y = 0;
      int k;
      for (k = 0; k < 256; k++) {
        double a = x * x - y * y + (i - 450.0) / 300;
        y = 2 * x * y + (j - 300.0) / 300;
        x = a;
        if (x * x + y * y > 4) break;
      }
      
      int red = (int) (Math.log(k) * 47);
      int green = red;
      int blue = 128 - (int) (Math.log(k) * 23);
      return (red << 16) | (green << 8) | blue;
    }
  }
  
  private class Mandelbrot2 extends Painter {
    @Override
    public int getRGB(int i, int j) {
      double a = 0, b = 0, c, d, n = 0;
      while((c = a * a) + (d = b * b) < 4 && n++ < 880) {
        b = 2 * a * b + j * 8e-9 - 0.645411;
        a = c - d + i * 8e-9 + 0.356888;
      }
      int red = getByte(255 * Math.pow((n - 80) / 800, 3.0));
      int green = getByte(255 * Math.pow((n - 80) / 800, 0.7));
      int blue = getByte(255 * Math.pow((n - 80) / 800, 0.5));
      return (red << 16) | (green << 8) | blue;
    }
  }
  
  private class Hyperbola extends Painter {
    @Override
    public int getRGB(int x, int y) {
      int a = 256, b = 256;
      int t = (int) (100 * 100 - (x - a) * (x - a) + (y - b) * (y - b) / 1.2);
      if (t >= 0) {
        int red = t % 0xff;
        return (red << 16) | 0xdd66;
      } else {
        return 0xffffff;
      }
    }
  }

  private class ImagePanel extends JPanel {
    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawImage(image, 0, 0, null);
    }
  }
}
