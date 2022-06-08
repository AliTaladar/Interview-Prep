import java.util.*;

class Program {
  public int[] threeNumberSort(int[] array, int[] order) {
    // Write your code here.
    int firstNumIdx = 0;
    for (int i = 0; i < array.length; i++) { // sort first nums
      if (array[i] == order[0]) {
        swap(i, firstNumIdx, array);
        firstNumIdx++;
      }
    }

    int secondNumIdx = firstNumIdx;
    for (int i = secondNumIdx; i < array.length; i++) { // sort second nums
      if (array[i] == order[1]) {
        swap(i, secondNumIdx, array);
        secondNumIdx++;
      }
    }
    // third nums will be sorted
    return array;
  }

  public void swap(int firstIdx, int secondIdx, int[] arr) {
    int temp = arr[firstIdx];
    arr[firstIdx] = arr[secondIdx];
    arr[secondIdx] = temp;
  }
}
