import java.util.*;

class Program {
  public static boolean balancedBrackets(String str) {
    // Write your code here.
    String openingBrackets = "({[";
    String closingBrackets = ")}]";
    Stack<Character> stack = new Stack<>();

    HashMap<Character, Character> matchingBrackets = new HashMap<>();
    matchingBrackets.put(')', '(');
    matchingBrackets.put('}', '{');
    matchingBrackets.put(']', '[');
    
    for (int i = 0; i < str.length(); i++) {
      char current = str.charAt(i);
      boolean isOpeningBracket = openingBrackets.indexOf(current) != -1;
      boolean isClosingBracket = closingBrackets.indexOf(current) != -1;
      
      if (isOpeningBracket) {
        stack.push(current);
      } else if (isClosingBracket) {
        if (stack.isEmpty() || stack.peek() != matchingBrackets.get(current)) return false;
        else stack.pop();
      }
    }
      
    return stack.isEmpty();
  }
}
