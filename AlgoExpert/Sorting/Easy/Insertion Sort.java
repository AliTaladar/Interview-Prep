import java.util.*;

class Program {
	public static int[] insertionSort(int[] array) {
		// Write your code here.

		for (int i = 0; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j] < array[j - 1]) {
				swap(j, j - 1, array);
				j--;
			}
		}

		return array;
	}

	public static void swap(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
