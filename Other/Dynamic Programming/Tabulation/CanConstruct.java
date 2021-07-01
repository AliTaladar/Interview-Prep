
public class main {
    public static void main(String[] args) {
        System.out.println(canConstruct("abcdef", new String[] {"ab", "abc", "de"}));
    }

    public static boolean canConstruct(String target, String[] wordBank) {
        boolean[] table = new boolean[target.length() + 1];
        table[0] = true;

        for(int i = 0; i < table.length; i++){
            if(!table[i]) continue;
            String newStr = target.substring(i);
            for(String word: wordBank){
                if(newStr.startsWith(word)){
                    table[i + word.length()] = true;
                }
            }
        }

        return table[target.length()];
    }

}