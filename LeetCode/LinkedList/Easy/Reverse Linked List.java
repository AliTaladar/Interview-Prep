/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next, curr = head, previous = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        
        return previous;
    }
}