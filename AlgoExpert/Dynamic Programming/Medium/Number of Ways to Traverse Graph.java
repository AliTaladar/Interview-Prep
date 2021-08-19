import java.util.*;

class Program {

  public int numberOfWaysToTraverseGraph(int width, int height) {
    // Write your code here.
		int[][] grid = new int[height][width];
		grid[0][0] = 1;
		
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				if(i == 0 && j == 0) continue;
				int up = 0, left = 0;
				if(i - 1 >= 0) up = grid[i - 1][j];
				if(j - 1 >= 0) left = grid[i][j - 1];
				grid[i][j] = up + left;
			}
		}
		
    return grid[height - 1][width - 1];
  }
}
