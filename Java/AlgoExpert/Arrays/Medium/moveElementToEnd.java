import java.util.*;

class Program {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    // Write your code here.
		
		int start = 0;
		int end = array.size() - 1;
		while(start < end){
			if(array.get(end) == toMove){
				end--;
			}else{
				if(array.get(start) == toMove)
					swap(array, start, end);
				start++;
			}
		}
		
    return array;
  }
	
	public static void swap(List<Integer> array, int index1, int index2){
		int temp = array.get(index1);
		array.set(index1, array.get(index2));
		array.set(index2, temp);
	}
}
