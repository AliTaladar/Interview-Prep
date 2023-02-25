import java.util.*;

class Program {

	public int numberOfWaysToTraverseGraph(int width, int height) {
		// Write your code here.
		int[][] grid = new int[height][width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || j == 0) {
					grid[i][j] = 1;
					continue;
				}
				int above = grid[i - 1][j];
				int left = grid[i][j - 1];
				grid[i][j] = above + left;
			}
		}

		return grid[height - 1][width - 1];
	}
}
