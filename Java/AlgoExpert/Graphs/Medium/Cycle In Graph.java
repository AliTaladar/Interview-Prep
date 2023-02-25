import java.util.*;

class Program {

  public boolean cycleInGraph(int[][] edges) {
    // Write your code here.
    int numOfNodes = edges.length;
    boolean[] visited = new boolean[numOfNodes];
    boolean[] currentlyInStack = new boolean[numOfNodes];

    boolean nodeInCycle = false;
    for (int node = 0; node < numOfNodes; node++) {
      if (visited[node]) continue;
      nodeInCycle = hasCycle(node, edges, visited, currentlyInStack);
      if (nodeInCycle) return true;
    }
    
    return false;
  }

  public boolean hasCycle(int node, int[][] edges, boolean[] visited, boolean[] currentlyInStack) {
    visited[node] = true;
    currentlyInStack[node] = true;

    boolean nodeInCycle = false;
    int[] neighbors = edges[node];
    for (int neighbor: neighbors) {
      if (!visited[neighbor])
        nodeInCycle = hasCycle(neighbor, edges, visited, currentlyInStack);

      if (nodeInCycle || currentlyInStack[neighbor]) return true;
    }

    currentlyInStack[node] = false;
    return false;
  }
}
