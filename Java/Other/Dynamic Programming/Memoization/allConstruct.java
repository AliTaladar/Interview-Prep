import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        String[] wordBank = {"a", "aa", "aaa", "aaaa", "aaaaa"};
        HashMap<String, ArrayList<LinkedList<String>>> memo = new HashMap<>();

        System.out.println(allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz", wordBank, memo));
    }

    public static ArrayList<LinkedList<String>> allConstruct(String target, String[] wordBank,
                                                             HashMap<String, ArrayList<LinkedList<String>>> memo) {
        if (target.equals("")) {
            ArrayList<LinkedList<String>> list = new ArrayList<>();
            list.add(new LinkedList<>());
            return list;
        }
        if(memo.containsKey(target)) return memo.get(target);

        ArrayList<LinkedList<String>> result = new ArrayList<>();

        for (String word : wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                ArrayList<LinkedList<String>> suffixWays = allConstruct(suffix, wordBank, memo);
                for (LinkedList<String> way : suffixWays) {
                    way.addFirst(word);
                    result.add(way);
                }

            }
        }

        memo.put(target, result);

        return result;
    }

}