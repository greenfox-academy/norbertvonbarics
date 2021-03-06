import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if ((a > b) && (a > c)) {
      return a;
    } else if ((b > c) && (b > a)) {
      return b;
    } else return c;
  }

  double median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size() % 2 != 0) {
      return (double) pool.get((pool.size() - 1) / 2);
    } else {
      return (double) (pool.get(pool.size() / 2) + pool.get(pool.size() / 2 - 1)) / 2;
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i', 'á', 'ú', 'ü', 'ű', 'ö', 'ő', 'é', 'í', 'ó').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    String lastLetter = hungarian.substring(hungarian.length() - 1);
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    if(isVowel(lastLetter.charAt(0))) {
      teve += lastLetter + "v" + lastLetter;
    }
    return teve;
  }
}