import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedList {

  public static void main(String[] args) {
    System.out.println(fileRead());
    System.out.println(decoder(fileRead()));
    writer(decoder(fileRead()));
  }

  public static List<String> decoder(List<String> text) {
    ArrayList<String> decodedMessage = new ArrayList<>();
    for (String line : text) {
      StringBuilder decoder = new StringBuilder();
      for (int i = 0; i < line.length(); i++) {
        int charValue = line.charAt(i);
        if (!Character.isWhitespace(line.charAt(i))) {
          decoder.append(String.valueOf((char) (charValue - 1)));
        } else {
          decoder.append(line.charAt(i));
        }
      }
      decodedMessage.add(decoder.toString());
    }
    return decodedMessage;
  }


  private static List<String> fileRead() {
    List<String> lines;
    Path text = Paths.get("assets/encoded-lines.txt");
    try {
      lines = Files.readAllLines(text);
    } catch (IOException ex) {
      System.out.println("READ ERROR!");
      lines = new ArrayList<>();
    }
    return lines;
  }

  private static void writer(List<String> text) {
    Path output = Paths.get("assets/decodedlines.txt");
    try {
      Files.write(output, text);
    } catch (IOException ex) {
      System.out.println("WRITE ERROR");
    }
  }
}
// Create a method that decrypts assets/encoded_zen_lines.txt