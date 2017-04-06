public class Main {

  public static void main(String[] args) {
    Tasks tasks = new Tasks();
    String tasksFileName = "tasks.csv";

    if (args.length == 0) {
      System.out.println("Java  ToDo application\n" +
              "======================\n" +
              "\n" +
              "Command line arguments:\n" +
              "-l   Lists all the tasks\n" +
              "-a   Adds a new task\n" +
              "-r   Removes a task\n" +
              "-c   Completes a task\n");
    } else if (args[0].equals("-l")) {
      tasks.list();
    }
    else if (args[0].equals("-a")){
      if(args[1].length() == 0){
        //egyik feladat az lesz hogy ide ki kell irni a hibat
      } else {
        tasks.add(args[1]);
      }
    }
  }
}
