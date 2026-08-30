package core.datastructure;

public class Datastructures {
  // NOTE first is integer data type that contains of four types
  // They are byte, short, int and long

  public static void init() {
    System.out.println("Integer Data types.....................");
    System.out.println(IntegerDataType.bytereturn());

    System.out.println("Character Data types...................");
    System.out.println(CharDataType.charreturn());

    System.out.println("Double Data types.................");
    System.out.println(DoubleDataType.doublereturn());
  }
}

class IntegerDataType {
  // basically byte are signed 8bit integer -128 to 127
  static byte bytereturn() {
    final byte a = 13;
    final byte b = 67;

    // a = 12;
    // b = 12;

    return a + b;
  }
}

class CharDataType {
  static char charreturn() {
    char ch1;
    char ch2;

    ch1 = 'x';
    ch2 = 3352;

    return ch1;
  }
}

class DoubleDataType {
  static double doublereturn() {
    double pi = 3.19;
    double r = 10.8;

    double area = pi * r * r;

    return area;
  }
}
