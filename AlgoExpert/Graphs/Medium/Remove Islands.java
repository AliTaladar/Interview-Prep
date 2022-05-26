import java.util.*;

class Program {

  public int[][] removeIslands(int[][] matrix) {
    // Write your code here.
    boolean[][] visited = new boolean[matrix.length][matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0)
          visited[i][j] = true;
        if (visited[i][j])
          continue;

        boolean isIsland = isIsland(matrix, visited, i, j);
        if (isIsland) removeCurrentIsland(matrix, i, j);
      }
    }

    
    return matrix;
  }

  public boolean isIsland(int[][] matrix, boolean[][] visited, int i, int j) {
    Queue<Integer[]> queue = new LinkedList<>();
    queue.add(new Integer[] {i, j});
    visited[i][j] = true;

    boolean isIsland = true;

    while (!queue.isEmpty()) {
      Integer[] current = queue.poll();

      i = current[0];
      j = current[1];

      if (i == 0 || i == matrix.length - 1 || j == 0 || j == matrix[i].length - 1)
        isIsland = false;

      if (i > 0 && !visited[i - 1][j] && matrix[i - 1][j] == 1) {
        queue.add(new Integer[] {i - 1, j});
        visited[i - 1][j] = true;
      }

      if (i < matrix.length - 1 && !visited[i + 1][j] && matrix[i + 1][j] == 1) {
        queue.add(new Integer[] {i + 1, j});
        visited[i + 1][j] = true;
      }

      if (j > 0 && !visited[i][j - 1] && matrix[i][j - 1] == 1) {
        queue.add(new Integer[] {i, j - 1});
        visited[i][j - 1] = true;
      }

      if (j < matrix[i].length - 1 && !visited[i][j + 1] && matrix[i][j + 1] == 1) {
        queue.add(new Integer[] {i, j + 1});
        visited[i][j + 1] = true;
      }
    }

    return isIsland;
  }

  public void removeCurrentIsland(int[][] matrix, int i, int j) {
    Queue<Integer[]> queue = new LinkedList<>();
    queue.add(new Integer[] {i, j});
    matrix[i][j] = 0;

    while (!queue.isEmpty()) {
      Integer[] current = queue.poll();

      i = current[0];
      j = current[1];

      if (i > 0 && matrix[i - 1][j] == 1) {
        queue.add(new Integer[] {i - 1, j});
        matrix[i - 1][j] = 0;
      }

      if (i < matrix.length - 1 && matrix[i + 1][j] == 1) {
        queue.add(new Integer[] {i + 1, j});
        matrix[i + 1][j] = 0;
      }

      if (j > 0 && matrix[i][j - 1] == 1) {
        queue.add(new Integer[] {i, j - 1});
        matrix[i][j - 1] = 0;
      }

      if (j < matrix[i].length - 1 && matrix[i][j + 1] == 1) {
        queue.add(new Integer[] {i, j + 1});
        matrix[i][j + 1] = 0;
      }
    }
  }

  
}
