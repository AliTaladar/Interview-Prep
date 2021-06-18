import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        System.out.println(gridTraveler(18,18, new HashMap<String, Integer>() {}));
    }


    public static int gridTraveler(int n, int m, HashMap<String, Integer> map) {
        if(n == 1 && m == 1) return 1;
        if(n == 0 || m == 0) return 0;
        String key = n + "," + m;
        if(!map.containsKey(key)){
            int result = gridTraveler(n - 1, m, map) + gridTraveler(n, m - 1, map);
            map.put(key, result);
        }
        return map.get(key);

    }
}
