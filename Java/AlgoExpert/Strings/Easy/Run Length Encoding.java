import java.util.*;

class Program {
  public String runLengthEncoding(String string) {
    // Write your code here.
		
		char currentChar = string.charAt(0);
		int counter = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < string.length(); i++){
			if(currentChar != string.charAt(i) || counter == 9){
				sb.append(counter).append(currentChar);
				counter = 0;
				currentChar = string.charAt(i);
			}
			counter++;
		}
		
		sb.append(counter).append(currentChar);
		
    return sb.toString();
  }
}
