import java.util.*;

class Program {
  // Do not edit the class below except
  // for the breadthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> breadthFirstSearch(List<String> array) {
      // Write your code here.
			LinkedList<Node> linkedList = new LinkedList<>();
			linkedList.add(this);
      return breadthFirstSearch(array, linkedList);
    }
		
		public List<String> breadthFirstSearch(List<String> array, LinkedList<Node> linkedList) {
      // Write your code here.
			array.add(this.name);
			
			for(Node child: children){
				linkedList.add(child);
			}
			
			linkedList.removeFirst();
			if(!linkedList.isEmpty())
				linkedList.get(0).breadthFirstSearch(array, linkedList);
			
      return array;
    }
		

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
