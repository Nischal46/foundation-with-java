package core.classandobjects;

class ParentClass {
  public String parentWelcomingManner() {
    return "hello";
  }

  public void printInvertedPyramid() {
    for (int i = 0; i < 10; i++) {
      for (int j = i; j < 10; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public void printHalfPyramid() {
    for (int i = 0; i < 10; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  protected void forEachUpgradedOfForLoop() {
    int[] num = { 12, 23, 34, 45, 54 };

    System.out.println("Printing array element by iterating:");
    for (int x : num) {
      System.out.println(x);
    }
  }
}

class ObjectProperty {
  double width;
  double height;
}

public class InheritanceConcept extends ParentClass {

  public void accessingProtectedFromParentclass() {
    forEachUpgradedOfForLoop();
  }

  public void callingOtherClass() {
    ObjectProperty obj1 = new ObjectProperty();
    obj1.width = 12;
    obj1.height = 56;

    ObjectProperty obj2 = obj1;
    System.out.println("Before making null");
    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj1.width);

    System.out.println("After making null one of them");
    obj1 = null;

    System.out.println(obj1);
    System.out.println(obj2);

    System.out.println(obj2.width);
  }

}
