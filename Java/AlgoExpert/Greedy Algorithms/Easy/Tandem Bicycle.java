import java.util.*;

class Program {

  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
    // Write your code here.
		Arrays.sort(redShirtSpeeds);
		Arrays.sort(blueShirtSpeeds);
		int maxTotalSpeed = 0;
		
		for (int i = 0; i < redShirtSpeeds.length; i++) {
			int j = fastest ? redShirtSpeeds.length - i - 1 : i;
			maxTotalSpeed += Math.max(redShirtSpeeds[i], blueShirtSpeeds[j]);
		}
		
    return maxTotalSpeed;
  }
}
