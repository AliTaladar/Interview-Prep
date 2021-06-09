import java.util.*;

class Program {

  public boolean generateDocument(String characters, String document) {
    // Write your code here.
		Map<Character, Integer> myMap = new HashMap<>();
		
		for(int i = 0; i < characters.length(); i++){
			if(myMap.containsKey(characters.charAt(i))){
				myMap.put(characters.charAt(i), myMap.get(characters.charAt(i)) + 1);
			}else{
				myMap.put(characters.charAt(i), 1);
			}
		}
				 
		for(int i = 0; i < document.length(); i++){
			if(!myMap.containsKey(document.charAt(i)) || myMap.get(document.charAt(i)) == 0)
				return false;
			else{
				myMap.put(document.charAt(i), myMap.get(document.charAt(i)) - 1);
			}
		}
		
    return true;
  }
}
