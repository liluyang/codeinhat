package com.fun.set2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageConverter {
  public static void main(String[] args) {
    new ImageConverter().encrypt();
  }

  private void encrypt() {
    try {
      BufferedImage image = ImageIO.read(new File("data/set2/encrypted.png"));
      for (int x = 0; x < image.getWidth(); x++) {
        for (int y = 0; y < image.getHeight(); y++) {
          int value = image.getRGB(x, y);
          // int newValue = value == 0xff000000 ? value : 0xff080808;
          int newValue = value == 0xff000000 ? value : 0xff808080;
          image.setRGB(x, y, newValue);
        }
      }
      File out = new File("data/set2/decrypted2.png");
      ImageIO.write(image, "png", out);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
