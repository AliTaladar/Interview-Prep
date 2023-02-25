import java.util.*;

class Program {

  public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
    // Write your code here.
    ArrayList<String> mnemonics = new ArrayList<>();
    HashMap<Character, Character[]> charMap = new HashMap<>();
    charMap.put('0', new Character[] {'0'});
    charMap.put('1', new Character[] {'1'});
    charMap.put('2', new Character[] {'a', 'b', 'c'});
    charMap.put('3', new Character[] {'d', 'e', 'f'});
    charMap.put('4', new Character[] {'g', 'h', 'i'});
    charMap.put('5', new Character[] {'j', 'k', 'l'});
    charMap.put('6', new Character[] {'m', 'n', 'o'});
    charMap.put('7', new Character[] {'p', 'q', 'r', 's'});
    charMap.put('8', new Character[] {'t', 'u', 'v'});
    charMap.put('9', new Character[] {'w', 'x', 'y', 'z'});

    
    phoneNumberMnemonics(0, new String[phoneNumber.length()], phoneNumber, mnemonics, charMap);
    return mnemonics;
  }

  public void phoneNumberMnemonics(int idx, String[] currentMnemonic,
                                   String phoneNumber, ArrayList<String> mnemonics,
                                   HashMap<Character, Character[]> charMap) {
    if (idx == phoneNumber.length()) {
      mnemonics.add(String.join("", currentMnemonic));
      return;
    }
    
    char charOfNum = phoneNumber.charAt(idx);
    Character[] letters = charMap.get(charOfNum);
    
    for (Character letter: letters) {
      currentMnemonic[idx] = letter.toString();
      phoneNumberMnemonics(idx + 1, currentMnemonic,
                            phoneNumber, mnemonics, charMap);
    }
    
  }
}
