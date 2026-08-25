package exercises;

import exercises.array.ArrayExercises;

public class ExercisesManager {
  public static void init() {
    ArrayExercises arr = new ArrayExercises();
    System.out.println("Highest number in array: " + arr.highestNumberInArray(new int[] { 12, 23, 98, 45, 56 }));

    System.out.println("Is array sorted or not: " + arr.isArraySoted(new int[] { 1, 3, 2, 5, 6 }));
    System.out.println("checking again array sorted or not: " + arr.isArraySoted(new int[] { 2, 3, 4, 5, 6 }));

    arr.sidelineZeroAtLast(new int[] { 2, 0, 0, 4, 5, 4, 0 });

    arr.removeElementAtSpecificIndex(new Integer[] { 23, 43, 65, 69, 75, 98 }, 69);
  }
}
