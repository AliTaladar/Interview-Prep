import java.util.*;

class Program {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
			if(value < this.value){
				if(left == null){
					left = new BST(value);
				} else{
					left.insert(value);
				}
			}else{
				if (right == null) {
					right = new BST(value);
				} else{
					right.insert(value);
				}
			}
			return this;
    }

    public boolean contains(int value) {
      // Write your code here.
			if (value < this.value) {
				if(left == null) return false;
				else return left.contains(value);
			} else if(value > this.value){
				if(right == null) return false;
				else return right.contains(value);
			} else return true;
    }

    public BST remove(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
			remove(value, null);
			
      return this;
    }
		
		public void remove(int value, BST parent){
			if (value < this.value){
				if(left != null){
					left.remove(value, this);
				}
			} else if(value > this.value){
				if(right != null){
					right.remove(value, this);
				}
			} else{
				if(left != null && right != null){
					this.value = right.findMin();
					right.remove(this.value, this);
				}else if(parent == null){
					if(left != null){
						this.value = left.value;
						right = left.right;
						left = left.left;
					}else if(right != null){
						this.value = right.value;
						left = right.left;
						right = right.right;
					}else{
						// this is a single-node tree; do nothing.
					}
				}else if(parent.left == this){
					if(left != null){
						parent.left = left;
					}else {
						parent.left = right;
					}
				}else if(parent.right == this) {
					if(left != null){
						parent.right = left;
					} else {
						parent.right = right;
					}
				}
			}
		}
		
		public int findMin(){
			if(left != null) return left.findMin();
			else return value;
		}
  }
}
