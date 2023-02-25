import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
    // Write your code here.
    int carry = 0;
    LinkedList head = null;
    LinkedList current = null;

    while (linkedListOne != null || linkedListTwo != null) {
      int valueOne = linkedListOne != null ? linkedListOne.value : 0;
      int valueTwo = linkedListTwo != null ? linkedListTwo.value : 0;
      int sum = valueOne + valueTwo + carry;

      int newValue = sum % 10;
      carry = sum / 10;

      if (current == null) {
        current = new LinkedList(newValue);
        head = current;
      } else {
        current.next = new LinkedList(newValue);
        current = current.next;
      }

      if (linkedListOne != null) linkedListOne = linkedListOne.next;
      if (linkedListTwo != null) linkedListTwo = linkedListTwo.next;
    }

    if (carry != 0) current.next = new LinkedList(carry);
    
    return head;
  }
}
