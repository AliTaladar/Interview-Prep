import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }
	
	static class TreeInfo {
		public boolean isBalanced;
		public int height;
		
		public TreeInfo(boolean isBalanced, int height) {
			this.isBalanced = isBalanced;
			this.height = height;
		}
	}

  public boolean heightBalancedBinaryTree(BinaryTree tree) {
    // Write your code here.
    return getTreeInfo(tree).isBalanced;
  }
	
	public TreeInfo getTreeInfo (BinaryTree tree) {
		if (tree == null) {
			return new TreeInfo(true, -1);
		}
		
		TreeInfo leftSubtreeInfo = getTreeInfo(tree.left);
		TreeInfo rightSubtreeInfo = getTreeInfo(tree.right);
		
		boolean isBalanced = leftSubtreeInfo.isBalanced &&
			rightSubtreeInfo.isBalanced &&
			Math.abs(rightSubtreeInfo.height - leftSubtreeInfo.height) <= 1;
		
		int height = 1 + Math.max(rightSubtreeInfo.height, leftSubtreeInfo.height);
		
		return new TreeInfo(isBalanced, height);
	}
}
