import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    // Write your code here.
		if(str == null) return false;
		int start = 0;
		int end = str.length() - 1;
		while(start < end){
			if(str.charAt(start) != str.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		
		return true;
  }
}
