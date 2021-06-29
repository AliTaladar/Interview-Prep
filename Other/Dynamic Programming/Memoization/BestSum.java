import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        int[] array = {1, 2, 5, 25};
        HashMap<Integer, ArrayList<Integer>> memo = new HashMap<>();
        System.out.println(bestSum(100, array, memo));
    }

    public static ArrayList<Integer> bestSum(int target, int[] array,
                                             HashMap<Integer, ArrayList<Integer>> memo) {
        // find the shortest array whose values sum up to target
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return new ArrayList<>();
        if (target < 0) return null;
        ArrayList<Integer> result;
        ArrayList<Integer> shortestSum = null;
        for (int num : array) {
            int remainder = target - num;

            result = bestSum(remainder, array, memo);
            if (result != null) {
                result.add(num);
                if (shortestSum == null || shortestSum.size() > result.size()) {
                    shortestSum = new ArrayList<>(result);
                }
                result.remove(result.size() - 1);
            }
        }

        memo.put(target, shortestSum);

        return shortestSum;
    }
}