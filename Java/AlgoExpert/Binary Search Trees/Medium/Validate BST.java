import java.util.*;

class Program {
  public static boolean validateBst(BST tree) {
    // Write your code here.
		if(tree == null) return true;
		boolean leftSide = validateBst(tree.left, tree.value - 1, Integer.MIN_VALUE);
		boolean rightSide = validateBst(tree.right, Integer.MAX_VALUE, tree.value);
		
		return leftSide && rightSide;
  }
	
public static boolean validateBst(BST tree, int maxPossibleValue, int minPossibleValue) {
		if(tree == null) return true;
		if(tree.value > maxPossibleValue || tree.value < minPossibleValue) return false;
		
		boolean leftSide = validateBst(tree.left, tree.value - 1, minPossibleValue);
		boolean rightSide = validateBst(tree.right, maxPossibleValue, tree.value);
		
		return leftSide && rightSide;
}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
