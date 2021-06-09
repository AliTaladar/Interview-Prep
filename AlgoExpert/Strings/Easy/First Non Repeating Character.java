import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    // Write your code here.
		Map<Character, Integer> myMap = new HashMap<>();
		
		for(int i = 0; i < string.length(); i ++){
			if(myMap.containsKey(string.charAt(i))){
				myMap.put(string.charAt(i), myMap.get(string.charAt(i)) + 1);
			}else{
				myMap.put(string.charAt(i), 1);
			}
		}
		
		for(int i = 0; i < string.length(); i ++){
			if(myMap.get(string.charAt(i)) == 1) return i;
		}
		
    return -1;
  }
}
