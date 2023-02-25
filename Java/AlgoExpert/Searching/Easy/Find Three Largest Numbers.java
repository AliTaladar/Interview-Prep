import java.util.*;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    // Write your code here.
		int[] largestNums = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		
		for(int i = 0; i < array.length; i++){
			if(array[i] > largestNums[2]){
				largestNums[0] = largestNums[1];
				largestNums[1] = largestNums[2];
				largestNums[2] = array[i];
			}else if(array[i] > largestNums[1]){
				largestNums[0] = largestNums[1];
				largestNums[1] = array[i];
			}else if(array[i] > largestNums[0]){
				largestNums[0] = array[i];
			}
		}
		
    return largestNums;
  }
}
