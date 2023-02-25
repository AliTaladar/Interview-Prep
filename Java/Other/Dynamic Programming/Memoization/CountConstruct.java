import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        String[] wordBank = {"e", "ee", "eee", "eeee", "eeeee", "eeeeee", "f"};
        HashMap<String, Integer> memo = new HashMap<>();
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                wordBank, memo));
    }

    public static int countConstruct(String word, String[] wordBank, HashMap<String, Integer> memo) {
        if(word.equals("")) return 1;
        if(memo.containsKey(word)) return memo.get(word);

        int sum = 0;
        for(String str: wordBank){
            if(word.startsWith(str)){
                int result = countConstruct(word.substring(str.length()), wordBank, memo);
                if(result != 0){
                    sum += result;
                }
            }
        }

        memo.put(word, sum);
        return sum;
    }

}