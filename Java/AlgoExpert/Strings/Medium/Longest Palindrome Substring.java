import java.util.*;

class Program {
  public static String longestPalindromicSubstring(String str) {
    // Write your code here.
    int[] currentLongest = new int[] {0, 1};

    for (int i = 1; i < str.length(); i++) {
      int[] odd = findLongestPalindrome(str, i - 1, i);
      int[] even = findLongestPalindrome(str, i - 1, i + 1);
      int[] longest = even[1] - even[0] > odd[1] - odd[0] ? even : odd;

      currentLongest = longest[1] - longest[0] > currentLongest[1] - currentLongest[0] ? longest : currentLongest;
    }
    
    return str.substring(currentLongest[0], currentLongest[1]);
  }

  public static int[] findLongestPalindrome(String str, int leftIdx, int rightIdx) {
    while (leftIdx >= 0 && rightIdx < str.length()) {
      if (str.charAt(leftIdx) != str.charAt(rightIdx)) break;
      leftIdx--;
      rightIdx++;
    }

    return new int[] {leftIdx + 1, rightIdx};
  }
  
}
