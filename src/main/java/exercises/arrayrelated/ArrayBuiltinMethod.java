package exercises.arrayrelated;

import java.util.*;

public class ArrayBuiltinMethod {
  public static void sortArrayInteger() {
    int[] arr = new int[] { 53, 12, 23, 57, 100, 67, 87 };
    Arrays.sort(arr);
    System.out.println("sorting array: " + Arrays.toString(arr));
  }

  public static void findIndexByBinarySearch() {
    int[] arr = new int[] { 67, 43, 23, 11, 78 };
    Arrays.sort(arr);
    Integer position = Arrays.binarySearch(arr, 23);
    System.out.println("found at:  " + position);
  }
}
