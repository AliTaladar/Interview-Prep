import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;
    public BinaryTree parent = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
    // Write your code here.
		if(node.right != null){
			return leftMostNode(node.right);
		}
		
		BinaryTree current = node;
		
		while(current.parent != null && current == current.parent.right){
			current = current.parent;
		}
		
    return current.parent;
  }
	
	public BinaryTree leftMostNode(BinaryTree node){
		BinaryTree current = node;
		
		while(current.left != null){
			current = current.left;
		}
		
		return current;
	
	}
}
