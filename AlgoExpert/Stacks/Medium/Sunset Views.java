import java.util.*;

class Program {

  public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
    // Write your code here.
    Stack<Integer> stack = new Stack<>();

    int idx, step;
    if (direction.equals("EAST")) {
      idx = buildings.length - 1;
      step = -1;
    } else {
      idx = 0;
      step = 1;
    }

    int tallestBuildingSoFar = 0;
    while (idx >= 0 && idx < buildings.length) {
      if (buildings[idx] > tallestBuildingSoFar) {
        stack.push(idx);
        tallestBuildingSoFar = buildings[idx];
      }
      idx += step;
    }

    ArrayList<Integer> result = new ArrayList<>(stack);
    if (direction.equals("EAST"))
      Collections.reverse(result);
    
    return result;
  }
}
