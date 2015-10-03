package com.fun.set1;

import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;

/**
 * Given image in a BufferedImage instance, calculate which color is most used?
 * - to read a pixel's color, use method BufferedImage.getRGB(int x, int y)
 * - to get image's width, use BufferedImage.getWidth()
 * - to get image's height, use BufferedImage.getHeight()
 */
public class Problem004 {
  public int solve(BufferedImage image) {
    // TODO: solve problem here.
    return -1;
  }
  
  @Test
  public void test1() {
    BufferedImage image = readImage("data/set1/white_soft.jpg");
    assertEquals(solve(image), -592138);
  }
  
  @Test
  public void test2() {
    BufferedImage image = readImage("data/set1/paper_cut.jpg");
    assertEquals(solve(image), -1513240);
  }
  
  private BufferedImage readImage(String imageFile) {
    try {
      return ImageIO.read(new File(imageFile));
    } catch (IOException e) {
      return new BufferedImage(0, 0, 0);
    }
  }
}
