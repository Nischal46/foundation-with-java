import datastructure.ArrayConcept;
import exercises.arrayrelated.ArrayrelatedQuestions;

public class Main {
  public static void main(String[] args) {
    // ArrayConcept.concept();
    // AlternateinArray.init();
    // AlternateinArray.searchelement(42);
    // AlternateinArray.findlargestelement();
    // AlternateinArray.checkarraysortedornot();

    // finite array
    int[] arr = new int[] { 1, 2, 4, 5, 3, 6 };

    ArrayrelatedQuestions result = new ArrayrelatedQuestions(arr);
    System.out.println("Logging of the constructor fn--" + result.isinitialized);
    result.methodone();

    ArrayrelatedQuestions.ArrayasObject();
  }
}
