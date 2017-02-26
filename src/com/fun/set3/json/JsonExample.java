package com.fun.set3.json;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fun.utils.FileUtils;

public class JsonExample {
  public static void main(String[] args) {
    JsonExample je = new JsonExample();
    je.testDaemon();

    // je.testJsonObject();
    // je.testJsonObject2();
  }

  private void testDaemon() {
    // read daemon.json into a string
    String daemonJson = FileUtils.readFile("data/set3/daemon.json");
    // parse string to a JSONObject
    JSONObject json = new JSONObject(daemonJson);
    // pretty-print JSONObject
    // System.out.println(json.toString(4));

    JSONArray daemons = json.getJSONArray("Daemons");
    System.out.println("There are " + daemons.length() + " daemons");

    JSONObject daemon1 = daemons.getJSONObject(0);
    // Increase stats:spirit by 1
    JSONObject stats = daemon1.getJSONObject("stats");
    stats.increment("spirit");
    // Add attribute "duration" to skill
    JSONObject skill = daemon1.getJSONObject("skill");
    skill.put("duration", 10);
    // Add array of "times" to skill
    skill.append("times", 200);
    skill.append("times", 500);
    // Print out all skill attributes names
    System.out.println("Skill has " + skill.length() + " keys");
    Iterator<String> keys = skill.keys();
    while (keys.hasNext()) {
      System.out.println(keys.next());
    }
    System.out.println();

    System.out.println(daemon1.toString(4));
  }

  private void testJsonObject() {
    String exampleJson = FileUtils.readFile("data/set3/example.json");
    JSONObject json = new JSONObject(exampleJson);
    // get the title
    System.out.println(json.get("title"));
    // get the data
    JSONArray genreArray = (JSONArray) json.get("dataset");
    // get the first genre
    JSONObject firstGenre = (JSONObject) genreArray.get(0);
    System.out.println(firstGenre.get("genre_title"));
  }

  private void testJsonObject2() {
    JSONObject dataset = new JSONObject();
    dataset.put("genre_id", 1);
    dataset.put("genre_parent_id", JSONObject.NULL);
    dataset.put("genre_title", "International");
    // use the accumulate function to add to an existing value. The value
    // will now be converted to a list
    dataset.accumulate("genre_title", "Pop");
    // append to the key
    dataset.append("genre_title", "slow");
    dataset.put("genre_handle", "International");
    dataset.put("genre_color", "#CC3300");

    // get the json array for a string
    System.out.println(dataset.getJSONArray("genre_title"));
    // prints ["International","Pop","slow"]

    // increment a number by 1
    dataset.increment("genre_id");

    System.out.println(dataset.toString(2));
  }
}
