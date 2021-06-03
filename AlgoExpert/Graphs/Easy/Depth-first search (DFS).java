import java.util.*;

class Program {
  // Do not edit the class below except
  // for the depthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
      // Write your code here.
			List<Node> visited = new ArrayList<Node>();
			return depthFirstSearch(array, visited);
    }
		
		public List<String> depthFirstSearch(List<String> array, List<Node> visited) {
      // Write your code here.
			if(visited.contains(this)){
				return array;
			}
			visited.add(this);
			array.add(this.name);
			for(Node child: children){
				array = child.depthFirstSearch(array, visited);
			}
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
