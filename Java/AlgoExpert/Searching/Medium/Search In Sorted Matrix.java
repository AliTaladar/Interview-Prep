import java.util.*;

class Program {
  public static int[] searchInSortedMatrix(int[][] matrix, int target) {
    // Write your code here.
    int row = 0;
    int col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
      if (target > matrix[row][col]) {
        row++;
      } else if (target < matrix[row][col]) {
        col--;
      } else {
        return new int[] {row, col};
      }
    }
    
    return new int[] {-1, -1};
  }
}
