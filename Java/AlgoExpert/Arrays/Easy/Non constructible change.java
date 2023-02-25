import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    if(coins.length == 0) return 1;
		
		Arrays.sort(coins);
		
		int currentChangeCreated = 0;
		
		for(int coin: coins){
			if(coin > currentChangeCreated + 1){
				return currentChangeCreated + 1;
			}
			
			currentChangeCreated += coin;
		}
		
		return currentChangeCreated + 1;
  }
}
