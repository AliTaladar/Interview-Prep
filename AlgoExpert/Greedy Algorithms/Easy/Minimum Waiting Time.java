import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    // Write your code here.
		Arrays.sort(queries);
		int queriesLeft = queries.length - 1;
		int totalWaitingTime = 0;
		
		for (int duration: queries) {
			totalWaitingTime += queriesLeft * duration;
			queriesLeft--;
		}
    return totalWaitingTime;
  }
}
