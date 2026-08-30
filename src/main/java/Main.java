import core.Core;
import dsa.gfg.Geeksforgeeks;

public class Main {
  public static void main(String... args) {
    System.out.println("logging args ---" + args[0]);
    System.out.println("== ==== DSA solving ==== ==");

    if (args[0].equals("dsa")) {
      Geeksforgeeks.init();
    } else {
      Core.initDataStructures();
    }
  }
}
