package exercises.arrayrelated;

import java.util.ArrayList;

public class AlternateinArray {
  public static void init() {
    System.out.println("Logged inside of alternate in array");
    int[] arr = { 1, 2, 3, 4, 5, 6 };

    ArrayList<Integer> filterarr = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        filterarr.add(arr[i]);
      }
    }

    System.out.println("Filter out array: " + filterarr);
  }

  public static void searchelement(int elementtosearch) {
    System.out.println("Concept of searching of element in array");
    int[] arr = { 1, 2, 3, 4, 5 };
    Boolean result = false;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == elementtosearch) {
        result = true;
        break;
      } else {
        result = false;
      }
    }

    if (result == true) {
      System.out.println(elementtosearch + " presents in array");
    } else {
      System.out.println(elementtosearch + " donot present in array");

    }
  }

  public static void findlargestelement() {
    int[] arr = { 12, 5, 76, 87, 43, 21 };
    int highestelement = 0;
    // find the largest element

    for (int i = 0; i < arr.length; i++) {
      if (highestelement < arr[i]) {
        highestelement = arr[i];
      }
    }

    System.out.println("Highest element in array " + arr + " is " + highestelement);
  }

  static boolean uniquefnarraycheck(int[] arr) {
    int elem = 0;
    boolean result = true;
    System.out.println("Logging element data in custom fn");
    for (int i = 0; i < arr.length; i++) {
      if (elem < arr[i]) {
        elem = arr[i];
        result = true;
      } else {
        result = false;
        break;
      }
    }

    if (result == true) {
      System.out.println("Array is sorted");
    } else {
      System.out.println("Array is unsorted");
    }

    return result;
  }

  public static void checkarraysortedornot() {
    int[] arr = { 1, 3, 2, 4, 5 };
    int[] arr2 = { 1, 2, 3, 4, 5 };

    uniquefnarraycheck(arr);
    uniquefnarraycheck(arr2);
  }

}
