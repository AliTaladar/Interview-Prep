import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        System.out.println(howSum(7, new int[]{2, 3}));
    }

    public static ArrayList<Integer> howSum(int target, int[] array) {
        ArrayList<Integer>[] table = new ArrayList[target + 1];
        table[0] = new ArrayList<>();

        for (int i = 0; i < table.length; i++) {
            if(table[i] == null) continue;
            for (int num : array) {
                if (i + num > target) continue;

                table[i + num] = new ArrayList<>(table[i]);
                table[i + num].add(num);
            }
        }

        return table[target];
    }

}