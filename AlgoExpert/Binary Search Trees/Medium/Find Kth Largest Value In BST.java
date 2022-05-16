import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }
	
	static class TreeInfo {
		public int numberOfNodesVisited;
		public int lastVisitedValue;
		
		public TreeInfo (int numberOfNodesVisited, int lastVisitedValue) {
			this.numberOfNodesVisited = numberOfNodesVisited;
			this.lastVisitedValue = lastVisitedValue;
		}
	}

  public int findKthLargestValueInBst(BST tree, int k) {
    // Write your code here.
		TreeInfo treeInfo = new TreeInfo(0, -1);
		reverseInOrderTraversal(tree, k, treeInfo);
    return treeInfo.lastVisitedValue;
  }
	
	public void reverseInOrderTraversal(BST node, int k, TreeInfo treeInfo) {
		if (node == null || treeInfo.numberOfNodesVisited >= k) return;
		
		reverseInOrderTraversal(node.right, k, treeInfo);
		if (treeInfo.numberOfNodesVisited < k) {
			treeInfo.numberOfNodesVisited++;
			treeInfo.lastVisitedValue = node.value;
			reverseInOrderTraversal(node.left, k, treeInfo);
		}
	}
}
