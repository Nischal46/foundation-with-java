import datastructure.ArrayConcept;
import datastructure.ArrayListConcept;
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

    // Already perform array related question
    // ArrayrelatedQuestions result = new ArrayrelatedQuestions(arr);
    // System.out.println("Logging of the constructor fn--" + result.isinitialized);
    // result.methodone();

    // concept related to arraylist

    ArrayrelatedQuestions.ArrayasObject();
    ArrayListConcept arrlist = new ArrayListConcept();
    System.out.println("Returning of the constructor: " + arrlist.init);

    ArrayListConcept.init();
  }
}
