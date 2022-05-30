import java.util.*;

class Program {

  public ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
    // Write your code here.
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    HashMap<Integer, ArrayList<Integer>> indices = getIndices(tasks); // O(n)
        
    Collections.sort(tasks); // O(n log(n))

    int start = 0;
    int end = 2 * k - 1;

    while (start < end) {
      int firstTask = tasks.get(start);
      int secondTask = tasks.get(end);
      
      ArrayList<Integer> firstTaskIndices = indices.get(firstTask);
      ArrayList<Integer> secondTaskIndices = indices.get(secondTask);
      
      int firstTaskIndex = firstTaskIndices.get(firstTaskIndices.size() - 1);
      firstTaskIndices.remove(firstTaskIndices.size() - 1);
      
      int secondTaskIndex = secondTaskIndices.get(secondTaskIndices.size() - 1);
      secondTaskIndices.remove(secondTaskIndices.size() - 1);

      ArrayList<Integer> pair = new ArrayList<>();
      pair.add(firstTaskIndex);
      pair.add(secondTaskIndex);

      result.add(pair);
      start++;
      end--;
    }
    
    return result;
  }

  public HashMap<Integer, ArrayList<Integer>> getIndices(ArrayList<Integer> tasks) {
    HashMap<Integer, ArrayList<Integer>> indices = new HashMap<>();
    
    for (int i = 0; i < tasks.size(); i++) {
      int task = tasks.get(i);
      if (indices.containsKey(task)) {
        ArrayList<Integer> arrOfIndices = indices.get(task);
        arrOfIndices.add(i);
      } else {
        ArrayList<Integer> arrOfIndices = new ArrayList<>();
        arrOfIndices.add(i);
        indices.put(task, arrOfIndices);
      }
    }

    return indices;
  }
}
