public class Strings {
  public static void main(String[] args) {
    char from = 'x';
    char to = 'y';
    System.out.println(xToY("xxyyxyxxxxyyy", from, to));
  }

  public static String xToY(String text, char from, char to) {
    int counter = text.length();

    if (counter == 0) {
      return text;
    }
    ;
    if (text.charAt(0) == from) {
      text = to + text.substring(1);
    }
    return text.charAt(0) + xToY(text.substring(1, text.length()), from, to);

  }
}

// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

