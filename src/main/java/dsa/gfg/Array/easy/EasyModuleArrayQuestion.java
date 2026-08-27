package dsa.gfg.Array.easy;

import java.util.ArrayList;
import java.util.Arrays;

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

  public static void moveAllNegativeNumberRight() {
  }
}

// [16, 17, 4, 3, 5, 2]
