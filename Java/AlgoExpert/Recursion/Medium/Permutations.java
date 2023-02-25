import java.util.*;

class Program {
  public static List<List<Integer>> getPermutations(List<Integer> array) {
    // Write your code here.
    List<List<Integer>> permutations = new ArrayList<>();
    permutationsHelper(0, array, permutations);
    return permutations;
  }

  public static void permutationsHelper(int i, List<Integer> array, List<List<Integer>> permutations) {
    if (i == array.size() - 1) {
      permutations.add(new ArrayList<>(array));
    } else {
      for (int j = i; j < array.size(); j++) {
        swap(array, i, j);
        permutationsHelper(i + 1, array, permutations);
        swap(array, i, j);
      }
    }
  }

  public static void swap(List<Integer> array, int i, int j) {
    int temp = array.get(i);
    array.set(i, array.get(j));
    array.set(j, temp);
  }
}
