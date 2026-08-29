package dsa.gfg.Array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class EasyModuleArrayQuestion {
  public static void arrayLeader(int[] arr) {
    System.out.println("Original arr: " + Arrays.toString(arr));
    ArrayList<Integer> finalResponse = new ArrayList<>();
    Integer totalIterator = arr.length;
    Integer currentElement = 0;

    for (int i = 0; i < totalIterator; i++) {

      if (i == totalIterator - 1) {
        finalResponse.add(arr[i]);
      }

      else {
        boolean isGreaterExist = false;
        for (int j = i; j < totalIterator - 1; j++) {

          if (arr[i] > arr[j]) {
          } else if (arr[i] == arr[j]) {
          } else {
            isGreaterExist = true;
            break;
          }
        }

        if (!isGreaterExist) {
          if (i == 0) {
            finalResponse.add(arr[i]);
          }
          if (currentElement > arr[totalIterator - 1]) {
            finalResponse.add(arr[i]);
          }
        }
      }

      currentElement = arr[i];
    }

    System.out.println("At last: ");
    System.out.println(finalResponse);
    System.out.println("");
  }

  public static void arrayLeaderImprovised(int[] arr) {
    ArrayList<Integer> result = new ArrayList<>();
    int maxRight = Integer.MIN_VALUE;
    System.out.println("maxRight: " + maxRight);

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] >= maxRight) {
        maxRight = arr[i];
        result.add(maxRight);
      }
    }

    Collections.reverse(result);
    System.out.println("result: " + result);
  }

  public static void encounterDuplicacyOfElement(int[] arr) {
    // logic to extract the duplicate of element in the array

    HashMap<Integer, Integer> duplicacyTrack = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {

    }

  }

  public static void moveAllNegativeNumberRight() {
  }
}

// [16, 17, 4, 3, 5, 2]
