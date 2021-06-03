import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here
		
		ArrayList<Integer[]> triplets = new ArrayList<>();
		
		Arrays.sort(array);
		for(int i = 0; i < array.length - 2; i++){
			int left = i + 1;
			int right = array.length - 1;
			while(left < right){
				int sum = array[i] + array[left] + array[right];
				if(sum == targetSum){
					Integer[] newTriplet = {array[i], array[left], array[right]};
					triplets.add(newTriplet);
					left++;
					right--;
				}else if(sum > targetSum){
					right--;
				}else if(sum < targetSum){
					left++;
				}
			}
		}
		
    return triplets;
  }
}


