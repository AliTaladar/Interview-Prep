import java.util.*;

class Program {
  public static List<List<Integer>> powerset(List<Integer> array) {
    // Write your code here.
    ArrayList<List<Integer>> powerset = new ArrayList<>();
    powerset.add(new ArrayList<Integer>());

    for (int num : array) {
      int currentLength = powerset.size();
      for (int i = 0; i < currentLength; i++) {
        List<Integer> newSet = new ArrayList<>(powerset.get(i));
        newSet.add(num);
        powerset.add(newSet);
      }
    }
    
    return powerset;
  }
}
