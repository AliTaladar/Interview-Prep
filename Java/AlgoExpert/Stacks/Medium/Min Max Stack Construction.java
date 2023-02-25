import java.util.*;

class Program {
  // Feel free to add new properties and methods to the class.
  static class MinMaxStack {

    final int MIN = 0, MAX = 1;
    
    List<Integer> stack = new ArrayList<>();
    List<Integer[]> minMaxStack = new ArrayList<>();
    
    public int peek() {
      // Write your code here.
      return stack.get(stack.size() - 1);
    }

    public int pop() {
      // Write your code here.
      minMaxStack.remove(minMaxStack.size() - 1);
      return stack.remove(stack.size() - 1);
    }

    public void push(Integer number) {
      // Write your code here.
      if (stack.isEmpty()) {
        stack.add(number);
        minMaxStack.add(new Integer[] {number, number});
      } else {
        int oldMin = minMaxStack.get(minMaxStack.size() - 1)[MIN];
        int oldMax = minMaxStack.get(minMaxStack.size() - 1)[MAX];
        int newMin = number < oldMin ? number : oldMin;
        int newMax = number > oldMax ? number : oldMax;
        
        stack.add(number);
        minMaxStack.add(new Integer[] {newMin, newMax});
      }
    }

    public int getMin() {
      // Write your code here.
      if (stack.isEmpty()) return -1;
      return minMaxStack.get(minMaxStack.size() - 1)[MIN];
    }

    public int getMax() {
      // Write your code here.
      if (stack.isEmpty()) return -1;
      return minMaxStack.get(minMaxStack.size() - 1)[MAX];
    }
  }
}
