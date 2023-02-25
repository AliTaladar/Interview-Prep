import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int countArr = 0;
		int countSeq = 0;
		
		while(countArr < array.size()){
			
			if(array.get(countArr) == sequence.get(countSeq)){
				countSeq++;
			}
			if(countSeq == sequence.size()){
				return true;
			}
			countArr++;
		}
		
    return false;
  }
}
