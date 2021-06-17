import java.util.*;

class Program {
  public static int maxSubsetSumNoAdjacent(int[] array) {
    // Write your code here.
		if(array.length == 0) return 0;
		else if(array.length == 1) return array[0];
		
		array[1] = Math.max(array[0], array[1]);
		
		for(int i = 2; i < array.length; i++){
			
			if(array[i - 2] + array[i] > array[i - 1]){
				array[i] = array[i - 2] + array[i];
			}else{
				array[i] = array[i - 1];
			}
		}
		
    return array[array.length - 1];
  }
}
