package core.stackConcept;

import java.util.Arrays;

class EncapsulatedStack {
  int[] seatnumber = new int[10];
  int totalSeat = 10;
  int reserved = 0;

  public void manageNumbers(int num, String action) {
    if (action.equals("push")) {
      if (reserved < totalSeat) {
        seatnumber[reserved++] = num;
      } else {
        System.out.println("Already seat already full. Cannot push");
      }
      }
  }

  public int[] storedData() {
    return seatnumber;
  }
}

public class StackConcept {
  public void init() {
    EncapsulatedStack obj = new EncapsulatedStack();
    int[] result;

    for (int i = 1; i < 15; i++) {
      obj.manageNumbers(i, "push");
    }

    result = obj.storedData();

    System.out.println("Finally getting of the return array: " + Arrays.toString(result));
  }

}
