import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        System.out.println(bestSum(100, new int[]{2, 3, 5, 98}));
    }

    public static ArrayList<Integer> bestSum(int target, int[] array) {
        ArrayList<Integer>[] table = new ArrayList[target + 1];
        table[0] = new ArrayList<>();

        for (int i = 0; i < table.length; i++) {
            if(table[i] == null) continue;
            for (int num : array) {
                if (i + num > target) continue;
                ArrayList<Integer> newList = new ArrayList<>(table[i]);
                newList.add(num);
                if(table[i + num] == null || table[i + num].size() > newList.size()){
                    table[i + num] = newList;
                }
            }
        }

        return table[target];
    }

}