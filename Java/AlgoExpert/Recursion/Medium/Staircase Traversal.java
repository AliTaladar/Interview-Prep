import java.util.*;

class Program {

  public int staircaseTraversal(int height, int maxSteps) {
    // Write your code here.
    if (height == 0) return 1;
    int numberOfWays = 0;
    
    for (int i = 1; i <= maxSteps; i++) {
      if (i > height) break;
      int childCount = staircaseTraversal(height - i, maxSteps);
      numberOfWays += childCount;
    }
    
    return numberOfWays;
  }

  
}
