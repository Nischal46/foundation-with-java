package exercises.arrayrelated;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayBuiltinMethod {

  public int[] arrCaptured;

  // NOTE method-overloading constructor
  public ArrayBuiltinMethod(int[] arrthroughparams) {
    this.arrCaptured = arrthroughparams;
  }

  public int[] sorting() {
    Arrays.sort(this.arrCaptured);
    return this.arrCaptured;
  }

  public List<Integer> sortingList(List<Integer> listthroughparams) {
    Collections.sort(listthroughparams);
    return listthroughparams;
  }
}
