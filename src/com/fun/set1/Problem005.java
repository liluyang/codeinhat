package com.fun.set1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.fun.utils.FileUtils;

/**
 * Jane Eyre, one of greatest english novel, has strong emotion description.
 * Throughout the book, do you know how many words synonym to angry have been
 * used?
 * 
 * - Full text of Jane Eyre is downloaded from internet and read into a String.
 * - All synonyms of angry are get from thesaurus.com and save in an array.
 */
public class Problem005 {
  public int countAngry(String fullText, String[] synonyms) {
    // TODO: your solution here.
    return 0;
  }

  @Test
  public void testJaneEyre() {
    String fullText = FileUtils.readFile("data/set1/jane_eyre.txt");
    String[] synonyms = new String[] { "annoyed", "bitter", "enraged", "exasperated", "furious",
        "heated", "impassioned", "indignant", "irate", "irritable", "irritated", "offended",
        "outraged", "resentful", "sullen", "uptight", "affronted", "antagonized", "chafed",
        "choleric", "convulsed", "cross", "displeased", "exacerbated", "ferocious", "fierce",
        "fiery", "fuming", "galled", "hateful", "hot", "huffy", "ill-tempered", "incensed",
        "inflamed", "infuriated", "irascible", "ireful", "maddened", "nettled", "piqued",
        "provoked", "raging", "riled", "sore", "splenetic", "storming", "sulky",
        "tumultous/tumultuous", "turbulent", "vexed", "wrathful" };
    assertEquals(countAngry(fullText, synonyms), 232);
  }
  
  @Test
  public void test1() {
    assertEquals(countAngry("Angry Bird", new String[]{"angry"}), 1);
  }
  
  @Test
  public void test2() {
    assertEquals(countAngry("Angry Bird is ANGRY!", new String[]{"angry"}), 2);
  }
  
  @Test
  public void test3() {
    assertEquals(countAngry("Angry Bird is annoyed", new String[]{"angry"}), 1);
  }
  
  @Test
  public void test4() {
    assertEquals(countAngry("Sleepy Bird", new String[]{"angry"}), 0);
  }
}
