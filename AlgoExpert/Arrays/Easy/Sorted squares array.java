import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
		int[] sortedSquares = new int[array.length];
		
		for(int i = 0; i < array.length; i++){ // log(n)
			sortedSquares[i] = array[i] * array[i];
		}
		
		Arrays.sort(sortedSquares); // n log(n)
		return sortedSquares;
  }
}
