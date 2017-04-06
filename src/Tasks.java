
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Tasks {

  public void list() {
    try {
      String content = new String(Files.readAllBytes(Paths.get("tasks")));
      if ("".equals(content)) {
        System.out.println("No todos for today! :)");
      } else {
        String[] lines = content.split("\n");
        for (int i = 0; i < lines.length; i++) {
          System.out.println(i + 1 + " - " + lines[i]);
        }
      }
    } catch (IOException e) {
      System.out.println(e + "Hiba tortent file beolvasasa kozben");
    }
  }

  public void add(String input) {
    //Google: add a new line to a file
    System.out.println("hhhhhhhhhhhh");
  }
}
