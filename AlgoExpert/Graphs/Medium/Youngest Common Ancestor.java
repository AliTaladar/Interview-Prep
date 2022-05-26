import java.util.*;

class Program {
  public static AncestralTree getYoungestCommonAncestor(
      AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
    // Write your code here.

    int descendantOneDepth = depth(descendantOne);
    int descendantTwoDepth = depth(descendantTwo);
    int difference = Math.abs(descendantOneDepth - descendantTwoDepth);

    if (descendantOneDepth > descendantTwoDepth) {
      for (int i = 0; i < difference; i++) descendantOne = descendantOne.ancestor;
    } else {
      for (int i = 0; i < difference; i++) descendantTwo = descendantTwo.ancestor;
    }

    while (descendantOne != descendantTwo) {
      descendantOne = descendantOne.ancestor;
      descendantTwo = descendantTwo.ancestor;
    }
    
    return descendantOne; // Replace this line
  }

  public static int depth(AncestralTree node) {
    int depth = 0;
    AncestralTree current = node;

    while (current.ancestor != null) {
      depth++;
      current = current.ancestor;
    }

    return depth;
  }

  static class AncestralTree {
    public char name;
    public AncestralTree ancestor;

    AncestralTree(char name) {
      this.name = name;
      this.ancestor = null;
    }

    // This method is for testing only.
    void addAsAncestor(AncestralTree[] descendants) {
      for (AncestralTree descendant : descendants) {
        descendant.ancestor = this;
      }
    }
  }
}
