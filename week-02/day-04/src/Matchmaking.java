import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>(Arrays.asList());
    String[] myArray = new String[11];
    for (int i = 0; i < boys.size(); i++) {
      if (i < 5) {
        order.add(girls.get(i));
      }
      order.add(boys.get(i));
      myArray = order.toArray(myArray);
    }
    System.out.println(Arrays.toString(myArray));
  }
}


// Join the two lists by matching one girl with one boy in the order list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...