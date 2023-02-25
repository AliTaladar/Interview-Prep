import java.util.*;

class Program {
  public static boolean isMonotonic(int[] array) {
    // Write your code here.
		if(isNotChanging(array)) return true;
    return isIncreasing(array) == !isDecreasing(array);
  }
	
	public static boolean isNotChanging(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			if(array[i] != array[i + 1]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isIncreasing(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			if(array[i] > array[i + 1]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isDecreasing(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			if(array[i] < array[i + 1]){
				return false;
			}
		}
		return true;
	}
}
