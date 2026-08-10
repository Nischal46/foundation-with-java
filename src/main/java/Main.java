import custompackages.Information;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Nischal");
    System.out.println("This is java programming");
    sum();

    System.out.println("understanding concept for args in real----");

    System.out.println("First arguement pass through terminal---" + args);

    Calculator.add(2, 3);
    Information.greetings("nischal dev");
  }

  public static void sum() {
    System.out.println("Ths is sum function");

    for (int i = 1; i < 19; i++) {
      System.out.println("Loop runs for " + i + "times");
    }
  }
}
