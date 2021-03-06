import java.util.*;

class Program {
  public static List<Integer> riverSizes(int[][] matrix) {
    // Write your code here.
		ArrayList<Integer> sizes = new ArrayList<>();
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (visited[i][j]) continue;
				traverseNode(i, j, matrix, visited, sizes);
			}
		}		
		
    return sizes;
  }
	
	public static void traverseNode(int i, int j, int[][] matrix, boolean[][] visited, ArrayList<Integer> sizes) {
		int currentRiverSize = 0;
		Stack<Integer[]> nodesToExplore = new Stack<>();
		nodesToExplore.push(new Integer[] {i, j});
		
		while (!nodesToExplore.isEmpty()) {
			Integer[] node = nodesToExplore.pop();
			i = node[0];
			j = node[1];
			
			if (visited[i][j])
				continue;
			visited[i][j] = true;
			
			if (matrix[i][j] == 0)
				continue;
			
			currentRiverSize++;
			
			ArrayList<Integer[]> unvisitedNeighbors = getUnvisitedNeighbors(i, j, matrix, visited);
			for (Integer[] neighbor: unvisitedNeighbors) {
				nodesToExplore.push(neighbor);
			}
		}
		
		if (currentRiverSize > 0)
			sizes.add(currentRiverSize);
	}
	
	public static ArrayList<Integer[]> getUnvisitedNeighbors(int i, int j, int[][] matrix, boolean[][] visited) {
		ArrayList<Integer[]> unvisitedNeighbors = new ArrayList<>();
		
		if (i > 0 && !visited[i - 1][j])
			unvisitedNeighbors.add(new Integer[] {i - 1, j});
		
		if (i < matrix.length - 1 && !visited[i + 1][j])
			unvisitedNeighbors.add(new Integer[] {i + 1, j});
			
		if (j > 0 && !visited[i][j - 1])
			unvisitedNeighbors.add(new Integer[] {i, j - 1});
		
		if (j < matrix[i].length - 1 && !visited[i][j + 1])
			unvisitedNeighbors.add(new Integer[] {i, j + 1});
			
		return unvisitedNeighbors;
	}
}


