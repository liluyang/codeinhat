package com.fun.set1;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

/**
 * <li>444-737-2138
 * <li>3097265148
 * <li>(800)213-7294
 * <li>650 734 7346
 * <li>1-408-624-3193
 * <li>314.509.2855
 * @author liluyang
 *
 */
public class Solution008 extends Problem008 {
  @Override
  public String findTelephoneNumber(String text) {
    HashMap<String, String> phonePatterns = new HashMap<String, String>();
    phonePatterns.put("(\\d{3})-(\\d{3})-(\\d{4})", "$1$2$3");
    phonePatterns.put("\\D(\\d{10})\\D", "$1");
    phonePatterns.put("\\((\\d{3})\\)(\\d{3})-(\\d{4})", "$1$2$3");
    phonePatterns.put("(\\d{3}) (\\d{3}) (\\d{4})", "$1$2$3");
    phonePatterns.put("1-(\\d{3})-(\\d{3})-(\\d{4})", "$1$2$3");
    phonePatterns.put("(\\d{3})\\.(\\d{3})\\.(\\d{4})", "$1$2$3");
    for (String key : phonePatterns.keySet()) {
      Pattern pattern = Pattern.compile(key);
      Matcher matcher = pattern.matcher(text);
      if (matcher.find()) {
        return matcher.group(0).replaceAll(key, phonePatterns.get(key));
      }
    }
    return null;
  }
  
  @Test
  public void test() {
    assertEquals(findTelephoneNumber("15357236048"), null);
  }
  
  @Test
  public void testA() {
    assertEquals(findTelephoneNumber("5357236048"), "5357236048");
  }
}
