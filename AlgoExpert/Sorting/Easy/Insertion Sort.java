import java.util.*;

class Program {
  public static int[] insertionSort(int[] array) {
    // Write your code here.
		
		for(int i = 0; i < array.length; i++){
			for(int j = i; j > 0; j--){
				if(array[j] < array[j - 1]){
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}else break;
			}
		}
		
    return array;
  }
}
