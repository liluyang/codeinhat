package com.fun.set1;

import static org.testng.Assert.assertEquals;

import java.util.ArrayDeque;
import java.util.Queue;

import org.testng.annotations.Test;

/**
 * Two queues of soldiers are crossing the bridge in opposite way, at speed of 1 meter per second.
 * Given the bridge's max load, will the bridge collapse? if so, when?
 * 
 * Input 
 *   weight[][] - all soldier's weight. weight[0] is first queue, weight[1] is second queue. Assume
 *       two queues have same length.
 *   bridgeLength - bridge's length 
 *   maxLoad - bridge's max load
 * Output
 *   the second when bridge will collapse; -1 if bridge will not collapse.
 */
public class Problem002a {
  public int solve(int[][] weight, int bridgeLength, int maxLoad) {
    // TODO: solve problem here.
    return -1;
  }
  
  @Test
  public void test1() {
    int[][] weight = new int[][] { { 120 }, { 120 } };
    assertEquals(solve(weight, 10, 250), -1);
  }

  @Test
  public void test2() {
    int[][] weight = new int[][] { { 120 }, { 120 } };
    assertEquals(solve(weight, 10, 239), 1);
  }

  @Test
  public void test3() {
    int[][] weight = new int[][] { { 120, 130, 140, 150, 160 }, { 120, 140, 160, 130, 150 } };
    assertEquals(solve(weight, 3, 890), -1);
  }

  @Test
  public void test4() {
    int[][] weight = new int[][] { { 120, 130, 140, 150, 160 }, { 120, 140, 160, 130, 150 } };
    assertEquals(solve(weight, 3, 880), 5);
  }

  @Test
  public void test5() {
    int[][] weight = new int[][] {
        { 141, 193, 191, 148, 176, 129, 135, 195, 136, 120, 186, 179, 129, 139, 152, 178, 174, 148,
            144, 192, 161, 169, 160, 138, 199, 136, 135, 168, 187, 141, 140, 175, 154, 160, 184,
            179, 150, 158, 142, 125, 148, 178, 138, 197, 193, 159, 183, 125, 145, 140, 139, 121,
            136, 173, 157, 174, 161, 171, 151, 198, 123, 127, 166, 125, 164, 160, 190, 172, 142,
            134, 123, 192, 126, 186, 194, 133, 179, 188, 149, 196, 179, 176, 166, 198, 129, 183,
            163, 148, 123, 149, 191, 141, 176, 132, 130, 131, 191, 133, 166, 130 },
        { 138, 142, 130, 190, 137, 196, 132, 168, 123, 166, 135, 156, 152, 195, 197, 186, 178, 122,
            165, 143, 137, 124, 197, 144, 157, 128, 163, 179, 158, 179, 149, 170, 144, 137, 169,
            156, 187, 133, 198, 161, 158, 144, 129, 137, 179, 137, 124, 170, 142, 122, 120, 149,
            191, 131, 172, 164, 135, 198, 174, 178, 135, 190, 173, 182, 195, 156, 161, 126, 166,
            175, 139, 180, 191, 175, 166, 191, 137, 183, 191, 185, 169, 189, 176, 168, 176, 159,
            183, 188, 144, 155, 150, 164, 140, 170, 180, 141, 184, 171, 161, 167 } };
    assertEquals(solve(weight, 20, 6804), -1);
  }

  @Test
  public void test6() {
    int[][] weight = new int[][] {
        { 138, 177, 149, 196, 155, 144, 147, 121, 185, 186, 136, 122, 142, 132, 140, 175, 152, 166,
            162, 152, 145, 127, 141, 187, 172, 168, 191, 169, 187, 195, 173, 124, 158, 144, 190,
            191, 166, 187, 194, 138, 135, 198, 192, 120, 172, 127, 151, 183, 164, 125, 182, 123,
            186, 172, 167, 127, 130, 147, 133, 169, 143, 142, 127, 169, 146, 125, 149, 190, 125,
            168, 175, 165, 150, 189, 125, 159, 135, 120, 185, 157, 194, 158, 169, 138, 161, 181,
            192, 198, 139, 163, 132, 171, 147, 130, 122, 126, 123, 189, 173, 131 },
        { 150, 138, 126, 125, 186, 196, 134, 129, 180, 195, 198, 133, 134, 122, 143, 123, 155, 173,
            142, 132, 124, 189, 143, 131, 139, 146, 178, 127, 155, 196, 171, 164, 131, 181, 163,
            182, 184, 158, 189, 195, 135, 133, 179, 148, 148, 184, 174, 144, 188, 185, 196, 142,
            135, 197, 123, 180, 170, 130, 140, 177, 137, 149, 195, 163, 169, 142, 195, 181, 178,
            161, 134, 121, 148, 145, 146, 126, 161, 186, 151, 142, 152, 139, 165, 167, 146, 127,
            139, 148, 181, 151, 154, 199, 182, 149, 120, 149, 171, 167, 176, 142 } };
    assertEquals(solve(weight, 20, 6695), 43);
  }
}
