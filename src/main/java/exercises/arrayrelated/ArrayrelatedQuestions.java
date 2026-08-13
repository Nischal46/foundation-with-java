package exercises.arrayrelated;

import java.util.Arrays;

public class ArrayrelatedQuestions {

  public String isinitialized;
  public int[] arrinitialized;

  // excepting of array inside param
  // performing of different exercises

  public ArrayrelatedQuestions(int[] arr) {
    this.isinitialized = "this happens due to constructor";
    this.arrinitialized = arr;
  }

  public void methodone() {
    System.out.println("This is scenario 1");
    System.out.println("Logging of the array initialized: " +
        Arrays.toString(this.arrinitialized));
  }

  public static void ArrayasObject() {

    ProgrammingLanguage[] arr;

    arr = new ProgrammingLanguage[5];

    arr[0] = new ProgrammingLanguage("js", "reactjs");
    arr[1] = new ProgrammingLanguage("rust", "axum");
    arr[2] = new ProgrammingLanguage("java", "spring");
    arr[3] = new ProgrammingLanguage("nodejs", "expressjs");

    System.out.println("[Before] Logging of the programming language array: ");
    System.out.println(Arrays.toString(arr));

    System.out.println("[After] array modification");
    arr[4] = new ProgrammingLanguage("js", "angularjs");
    System.out.println(Arrays.toString(arr));
  }
}

class ProgrammingLanguage {

  String language;
  String framework;

  ProgrammingLanguage(String language, String framework) {
    this.language = language;
    this.framework = framework;
  }

  @Override
  public String toString() {
    return "{language: '" + language + "', framework: '" + framework + "'}";
  }
}
