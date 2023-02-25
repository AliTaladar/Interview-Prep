import java.util.*;

class Program {

  public int minimumPassesOfMatrix(int[][] matrix) {
    // Write your code here.
    int current = 0;
    int next = 1;
    int numOfPasses = 0;
    Queue<Integer[]> queue = new LinkedList<>();

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if (matrix[row][column] > 0)
          queue.add(new Integer[] {row, column, current});
      }
    }

    while (!queue.isEmpty()) {
      Integer[] currentPos = queue.poll();
      int row = currentPos[0];
      int column = currentPos[1];
      if (currentPos[2] == next) {
        numOfPasses++;
        next = current;
        current = currentPos[2];
      }
      if (row > 0 && matrix[row - 1][column] < 0) {
        matrix[row - 1][column] *= -1;
        queue.add(new Integer[] {row - 1, column, next});
      }
      if (row < matrix.length - 1 && matrix[row + 1][column] < 0) {
        matrix[row + 1][column] *= -1;
        queue.add(new Integer[] {row + 1, column, next});
      }
      if (column > 0 && matrix[row][column - 1] < 0) {
        matrix[row][column - 1] *= -1;
        queue.add(new Integer[] {row, column - 1, next});
      }
      if (column < matrix[row].length - 1 && matrix[row][column + 1] < 0) {
        matrix[row][column + 1] *= -1;
        queue.add(new Integer[] {row, column + 1, next});
      }
    }

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if (matrix[row][column] < 0)
          return -1;
      }
    }
    
    return numOfPasses;
  }
}
