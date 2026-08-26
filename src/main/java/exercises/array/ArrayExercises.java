package exercises.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayExercises {

  int[] arrInsideScope;

  public ArrayExercises() {
    System.out.println("This is constructor. It will auto initialized");
  }

  public Integer highestNumberInArray(int[] arr) {
    Integer highestNumber = 0;
    for (int i = 0; i < arr.length; i++) {
      if (highestNumber < arr[i]) {
        highestNumber = arr[i];
      }
    }
    return highestNumber;
  }

  public Boolean isArraySoted(int[] arr) {
    boolean result = false;
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        result = true;
      } else if (arr[i] > arr[i + 1]) {
        result = false;
        return result;
      } else {
        result = true;
      }
    }
    return result;
  }

  public void sidelineZeroAtLast(int[] arr) {
    int swapper = 0;
    System.out.println("sidelining zero at last -------");
    System.out.println("Original array: " + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] == 0) {
          swapper = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = swapper;
        }
      }
    }

    System.out.println("Result: " + Arrays.toString(arr));
  }

  public void removeElementAtSpecificIndex(Integer[] arr, Integer elementToDelete) {

    System.out.println("Removing element from specific index----");
    System.out.println("Original array: " + Arrays.toString(arr));

    boolean foundElement = false;
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        arr[i] = null;
      } else if (arr[i] == elementToDelete) {
        arr[i] = arr[i + 1];
        foundElement = true;
      } else {
        if (foundElement == true) {
          arr[i] = arr[i + 1];
        }
        arr[i] = arr[i];
      }
    }

    System.out.println("After removing: " + Arrays.toString(arr));
  }

  public void findDuplicateElements(int[] arr) {
    System.out.println("finding of the duplicate elements from array --------");
    System.out.println("Original array: " + Arrays.toString(arr));

    HashMap<Integer, Integer> obj = new HashMap<>();

    // through normal method
    for (int i = 0; i < arr.length; i++) {
      if (obj.get(arr[i]) == true) {
        System.out.println("duplicate");
      } else {
        obj.put(arr[i], arr[i]);
      }
    }

    System.out.println("hashmap: " + obj);
  }

}
