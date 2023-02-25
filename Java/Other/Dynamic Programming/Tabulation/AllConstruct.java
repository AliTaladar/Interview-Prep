import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println(allConstruct("abcdef",
                new String[] {"ab", "abc", "cd", "def", "abcd", "ef", "c"}));
    }

    public static ArrayList<ArrayList<String>> allConstruct(String target, String[] wordBank) {
        ArrayList<ArrayList<String>>[] table = new ArrayList[target.length() + 1];
        table[0] = new ArrayList<>();
        table[0].add(new ArrayList<>());

        for(int i = 0; i < table.length; i++){
            if(table[i] == null) continue;
            String newStr = target.substring(i);
            for(String word: wordBank){
                if(newStr.startsWith(word)){
                    for(ArrayList<String> list: table[i]){
                        ArrayList<String> newList = new ArrayList<>(list);
                        newList.add(word);
                        if(table[i + word.length()] == null)
                            table[i + word.length()] = new ArrayList<>();
                        table[i + word.length()].add(newList);
                    }
                }
            }
        }
        return table[target.length()];
    }

}