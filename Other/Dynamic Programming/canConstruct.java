import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        String[] wordBank = {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"};
        HashMap<String, Boolean> memo = new HashMap<>();
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                wordBank, memo));
    }

    public static boolean canConstruct(String word, String[] wordBank, HashMap<String, Boolean> memo) {
        if (word.equals("")) return true;
        if (memo.containsKey(word)) return memo.get(word);

        for (String str : wordBank) {
            if (word.startsWith(str)) {
                if (canConstruct(word.substring(str.length()), wordBank, memo)) {
                    return true;
                }
            }
        }

        memo.put(word, false);

        return false;
    }


}

