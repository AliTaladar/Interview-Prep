import java.util.*;

class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
    return findClosestValueInBst(tree, target, tree.value);
  }
	
	public static int findClosestValueInBst(BST tree, int target, int closest) {
    // Write your code here.
		if(Math.abs(target - tree.value) < Math.abs(target - closest)){
			closest = tree.value;
		}
		
		if(target > tree.value && tree.right != null){
			return findClosestValueInBst(tree.right, target, closest);
		}else if(target < tree.value && tree.left != null){
			return findClosestValueInBst(tree.left, target, closest);
		}else{
			return closest;
		}
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
