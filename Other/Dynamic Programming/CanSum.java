import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        int[] array = {1, 2};
        HashMap<Integer, Boolean> memo = new HashMap<>();
        System.out.println(canSum(array, 5900, memo));
    }


    public static boolean canSum(int[] array, int target, HashMap<Integer, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return true;
        if (target < 0) return false;

        for (int num : array) {
            if (canSum(array, target - num, memo)) {
                memo.put(target, true);
                return true;
            }
        }

        memo.put(target, false);
        return false;
    }
}
