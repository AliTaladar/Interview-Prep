import java.util.*;

class Program {
  public static int levenshteinDistance(String str1, String str2) {
    // Write your code here.
		int[][] grid = new int[str1.length() + 1][str2.length() + 1];
		
		for (int column = 0; column < grid[0].length; column++) {
			grid[0][column] = column;
		}
		
		for (int row = 0; row < grid.length; row++) {
			grid[row][0] = row;
		}
		
		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid[i].length; j++) {
				char str1Char = str1.charAt(i - 1);
				char str2Char = str2.charAt(j - 1);
				
				if (str1Char == str2Char) {
					grid[i][j] = grid[i - 1][j - 1];
				} else {
					grid[i][j] = 1 + Math.min(grid[i - 1][j - 1], Math.min(grid[i - 1][j], grid[i][j - 1]));
				}
			}
		}
		
    return grid[str1.length()][str2.length()];
  }
}
