import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        int[] array = {7, 14};
        HashMap<Integer, ArrayList<Integer>> memo = new HashMap<>();
        System.out.println(howSum(array, 300, memo));

    }


    public static ArrayList<Integer> howSum(int[] array, int target,
                                            HashMap<Integer, ArrayList<Integer>> memo) {
        if(memo.containsKey(target)) return memo.get(target);
        if (target == 0) new ArrayList<Integer>();
        if (target < 0) return null;

        for (int num : array) {
            int remainder = target - num;
            ArrayList<Integer> result = howSum(array, remainder, memo);
            if (result != null) {
                result.add(num);
                memo.put(num, result);
                return result;
            }
        }
        memo.put(target, null);
        return null;
    }
}
