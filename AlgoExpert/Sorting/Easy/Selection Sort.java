import java.util.*;

class Program {
  public static int[] selectionSort(int[] array) {
    // Write your code here.
		
		for(int i = 0; i < array.length - 1; i++){
			int minimum = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[minimum] > array[j]){
					minimum = j;
				}
				
			}
			
			int temp = array[i];
				array[i] = array[minimum];
				array[minimum] = temp;
		}
		
    return array;
  }
}
