import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
		key = key % 26;
		char[] characters = new char[str.length()];
		
		for(int i = 0; i < characters.length; i++){
			characters[i] = getNewLetter(str.charAt(i), key);
		}
		
    return new String(characters);
  }
	
	public static char getNewLetter(char letter, int key){
		int newLetterNum = (int) letter + key;
		if(newLetterNum > 122){
			newLetterNum = newLetterNum % 122 + 96;
		}
		
		return (char) newLetterNum;
	}
}
