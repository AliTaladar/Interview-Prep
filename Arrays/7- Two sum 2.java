import java.util.*;

class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Map<Integer, Integer> myMap = new HashMap<>();

        for(int i = 0; i < array.length; i++){ // log n
            int complement = targetSum - array[i];

            if(myMap.containsKey(complement)){
                return new int[] {i, myMap.get(complement)};
            }else{
                myMap.put(array[i], i);
            }
        }

        return new int[]{};
    }
}
