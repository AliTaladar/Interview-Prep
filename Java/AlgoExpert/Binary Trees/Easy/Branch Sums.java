import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.
		List<Integer> list = new ArrayList<>();
    return branchSums(root, 0, list);
  }
	
	public static List<Integer> branchSums(BinaryTree root, int currentSum, List<Integer> list) {
		currentSum += root.value;
    if(root.left == null && root.right == null){
			list.add(currentSum);
			return list;
		}
		
		if(root.left != null){
			list = branchSums(root.left, currentSum, list);
		}
		
		if(root.right != null){
			list = branchSums(root.right, currentSum, list);
		}
		
		return list;
		
  }
}
