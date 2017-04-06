/**
 * Created by Fekete Imre on 2017.04.06..
 */
public class Main {
  public static void main(String[] args) {


    if (args.length ==0) {
      System.out.println("Java  ToDo application\n" +
              "======================\n" +
              "\n" +
              "Command line arguments:\n" +
              "-l   Lists all the tasks\n" +
              "-a   Adds a new task\n" +
              "-r   Removes an task\n" +
              "-c   Completes an task\n");
    }
  }
}
