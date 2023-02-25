import java.util.*;

class Program {
  public static BST minHeightBst(List<Integer> array) {
    // Write your code here.
		return minHeightBst(array, 0, array.size() - 1);
  }
	
	public static BST minHeightBst(List<Integer> array, int start, int end) {
    // Write your code here.
		if (end < start) return null;
		int middle = (start + end) / 2;
		BST head = new BST(array.get(middle));
		head.left = minHeightBst(array, start, middle - 1);
		head.right = minHeightBst(array, middle + 1, end);
		return head;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
      left = null;
      right = null;
    }

    public void insert(int value) {
      if (value < this.value) {
        if (left == null) {
          left = new BST(value);
        } else {
          left.insert(value);
        }
      } else {
        if (right == null) {
          right = new BST(value);
        } else {
          right.insert(value);
        }
      }
    }
  }
}
