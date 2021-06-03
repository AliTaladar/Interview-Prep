import java.util.*;

class Program {

  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
    return nodeDepths(root, 0, 0);
  }
	
	public static int nodeDepths(BinaryTree root, int totalSum, int currentNodeDepth) {
    // Write your code here.
    if(root == null){
			return totalSum;
		}else{
			totalSum += currentNodeDepth;
			totalSum = nodeDepths(root.left, totalSum, currentNodeDepth + 1);
			totalSum = nodeDepths(root.right, totalSum, currentNodeDepth + 1);
		}
		
		return totalSum;
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
