import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(fibunacci(46, map));

    }


    public static int fibunacci(int n, HashMap<Integer, Integer> map) {
        if (n <= 2) return 1;
        if (!map.containsKey(n)) {
            map.put(n, fibunacci(n - 1, map) + fibunacci(n - 2, map));
        }
        return map.get(n);
    }
}
