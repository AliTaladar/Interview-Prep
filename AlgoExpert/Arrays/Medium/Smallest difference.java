import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.
		
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		
		int pointer1 = 0, pointer2 = 0;
		int current = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		int[] smallestPair = new int[2];
		
		while(pointer1 != arrayOne.length && pointer2 != arrayTwo.length){
			int firstNum = arrayOne[pointer1];
			int secondNum = arrayTwo[pointer2];
			
			if(firstNum < secondNum){
				current = secondNum - firstNum;
				pointer1++;
			}else if(firstNum > secondNum){
				current = firstNum - secondNum;
				pointer2++;
			}else{
				return new int[] {firstNum, secondNum};
			}
			
			if(smallest > current){
				smallest = current;
				smallestPair[0] = firstNum;
				smallestPair[1] = secondNum;
			}
		}
		
    return smallestPair;
  }
}
