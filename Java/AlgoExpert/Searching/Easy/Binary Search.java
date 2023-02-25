import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
    
		int start = 0;
		int end = array.length - 1;
		
		while(start <= end){
			int middle = (start + end) / 2;
			
			if(array[middle] == target){
				return middle;
			}else if(array[middle] > target){
				end = middle - 1;
			}else{
				start = middle + 1;
			}
		}
		
		return -1;
  }
}
