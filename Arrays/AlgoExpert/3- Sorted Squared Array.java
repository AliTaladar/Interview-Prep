import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    int[] sortedSquares = new int[array.length];
		
		int smallerIndex = 0;
		int largerIndex = array.length - 1;
		
		for(int i = sortedSquares.length - 1; i >= 0; i--){
			if(Math.abs(array[smallerIndex]) > Math.abs(array[largerIndex])){
				sortedSquares[i] = array[smallerIndex] * array[smallerIndex];
				smallerIndex++;
			}else{
				sortedSquares[i] = array[largerIndex] * array[largerIndex];
				largerIndex--;
			}
		}
		
		return sortedSquares;
  }
}
