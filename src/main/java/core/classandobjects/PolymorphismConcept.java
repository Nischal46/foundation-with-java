package core.classandobjects;

// there are two types of polymorphism concept one is runtime and another is compile time
class PolymorphismByCompileTime {

  // compile time also known as static polymorphism determined during compilation
  // achieved through method overloading

  static int Multiply(int a, int b) {
    return a * b;
  }

  static double Multiply(double a, double b) {
    return a * b;
  }

}

class PolymorphismByRuntime {
  void PrintIdentification() {
    System.out.println("[Identification]: Polymorphism by runtime");
  }
}

class ExtendsProperty extends PolymorphismByRuntime {
  void PrintIdentification() {
    System.out.println("Method override experienced [value changes]");
  }
}

public class PolymorphismConcept {
  public void init() {
    System.out.println("Polymorphism concept [compile time through method overloading]");
    System.out.println("Through int method");
    System.out.println(PolymorphismByCompileTime.Multiply(2, 3));
    System.out.println();
    System.out.println("Through double method");
    System.out.println(PolymorphismByCompileTime.Multiply(2, 3.4));

    PolymorphismByRuntime a;
    a = new ExtendsProperty();
    a.PrintIdentification();
  }
}
