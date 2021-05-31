import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		Set<Integer> mySet = new HashSet<>();
		
		for(int i = 0; i < array.length; i++){ // log n
			int complement = targetSum - array[i];
			
			if(mySet.contains(complement)){
				return new int[] {array[i], complement};
			}else{
				mySet.add(array[i]);
			}
		}
		
		return new int[]{};
  }
}
