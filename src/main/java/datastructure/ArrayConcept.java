package datastructure;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConcept {
  public static void concept() {
    System.out.println("In this package, array concept consists");

    // Array example
    int[] arr = { 10, 20, 30, 40 };
    System.out.println(Arrays.toString(arr));

    // ArrayList example
    ArrayList<Integer> list = new ArrayList<>();
    list.add(23);
    list.add(54);
    list.add(65);

    System.out.println(list);

    System.out.println("---------------------------------");
    intarraydatawithloop();
    System.out.println("---------------------------------");
    stringarraydatawithloop();
    System.out.println("---------------------------------");

    Student[] starray;

    starray = new Student[5];

    starray[0] = new Student(1, "nischal baniya");

    System.out.println("Total student listed: " + starray.length);

    // accessing the element inside of array by looping

    for (int i = 0; i < starray.length; i++) {
      if (starray[i] == null) {
        System.out.println("Empty vacate array not inserted");
      } else {
        System.out.println("student data at index " + i + ": { " + starray[i].roll_no + ": " + starray[i].name + " }");

      }
    }
  }

  public static int intarraydatawithloop() {
    int[] arr = { 12, 23, 34, 54, 65, 76, 87 };
    int n = arr.length;

    System.out.println("Printing out the int data in loop");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    return 1;
  }

  public static String stringarraydatawithloop() {
    String[] arr = { "javascript", "rust", "java" };

    System.out.println("Printing out the string data in loop");
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");

    return "resolved string data array";
  }
}

class Student {
  public int roll_no;
  public String name;

  Student(int roll_no, String name) {
    this.roll_no = roll_no;
    this.name = name;
  }
}
