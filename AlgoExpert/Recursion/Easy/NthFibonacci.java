import java.util.*;

class Program {
  public static int getNthFib(int n) {
    // Write your code here.
		int[] lastTwo = {0, 1};
		
		if(n == 1 || n == 2){
			return lastTwo[n - 1];
		}
		
		int counter = 3;
		while(counter <= n){
			int nextFib = lastTwo[0] + lastTwo[1];
			lastTwo[0] = lastTwo[1];
			lastTwo[1] = nextFib;
			counter++;
		}
		
    return lastTwo[1];
  }
}
