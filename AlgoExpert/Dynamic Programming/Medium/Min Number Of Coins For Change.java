import java.util.*;

class Program {
  public static int minNumberOfCoinsForChange(int n, int[] denoms) {
    // Write your code here.
		int[] numberOfCoins = new int[n + 1];
		Arrays.fill(numberOfCoins, Integer.MAX_VALUE);
		numberOfCoins[0] = 0;
		
		for(int denom: denoms){
			for(int amount = 1; amount < numberOfCoins.length; amount++){
				if(denom <= amount){
					int newNum;
					if(numberOfCoins[amount - denom] == Integer.MAX_VALUE)
						newNum = numberOfCoins[amount - denom];
					else
						newNum = numberOfCoins[amount - denom] + 1;
					if(newNum < numberOfCoins[amount]){
						numberOfCoins[amount] = newNum;
					}
				}
			}
		}
		
    return numberOfCoins[n] != Integer.MAX_VALUE ? numberOfCoins[n]: -1;
  }
}
