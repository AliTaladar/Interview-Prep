import java.util.*;

class Program {
  public static void removeKthNodeFromEnd(LinkedList head, int k) {
    // Write your code here.
    LinkedList firstPointer = head;
    LinkedList secondPointer = head;
    int count = 0;
    
    while (count < k) {
      secondPointer = secondPointer.next;
      count++;
    }

    if (secondPointer == null) {
      head.value = head.next.value;
      head.next = head.next.next;
      return;
    }

    while (secondPointer.next != null) {
      firstPointer = firstPointer.next;
      secondPointer = secondPointer.next;
    }
    firstPointer.next = firstPointer.next.next;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}
