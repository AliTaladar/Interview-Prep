import java.util.*;

class Program {
	public static int maxSubsetSumNoAdjacent(int[] array) {
		// Write your code here.
		if (array.length == 0) return 0;
		if (array.length == 1) return array[0];

		int first = array[0];
		int second = Math.max(array[0], array[1]);

		for (int i = 2; i < array.length; i++) {
			int current = Math.max(array[i] + first, second);
			first = second;
			second = current;
		}

		return second;
	}
}
