
public class main {
    public static void main(String[] args) {
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                new String[] {"e", "ee", "eee", "eeee", "eeeeef"}));
    }

    public static int countConstruct(String target, String[] wordBank) {
        int[] table = new int[target.length() + 1];
        table[0] = 1;

        for(int i = 0; i < table.length; i++){
            if(table[i] == 0) continue;
            String newStr = target.substring(i);
            for(String word: wordBank){
                if(newStr.startsWith(word)){
                    table[i + word.length()] += table[i];
                }
            }
        }

        return table[target.length()];
    }

}