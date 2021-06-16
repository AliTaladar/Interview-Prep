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

  public int binaryTreeDiameter(BinaryTree tree) {
    // Write your code here.
    return getTreeInfo(tree).diameter;
  }
	
	public TreeInfo getTreeInfo(BinaryTree tree){
		if(tree == null) return new TreeInfo(0, 0);
		
		TreeInfo leftTreeInfo = getTreeInfo(tree.left);
		TreeInfo rightTreeInfo = getTreeInfo(tree.right);
		
		int longestPathThroughNode = leftTreeInfo.height + rightTreeInfo.height;
		int maxDiameterSoFar = Math.max(leftTreeInfo.diameter, rightTreeInfo.diameter);
		int currentHeight = Math.max(leftTreeInfo.height, rightTreeInfo.height) + 1;
		int currentDiameter = Math.max(longestPathThroughNode, maxDiameterSoFar);
		
		return new TreeInfo(currentDiameter, currentHeight);
	}
	
	static class TreeInfo {
    public int diameter;
		public int height;

    public TreeInfo(int diameter, int height) {
      this.diameter = diameter;
			this.height = height;
    }
  }
}
