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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyHead = new ListNode();
        ListNode l3 = dummyHead;
        
        int carry = 0;
        while(l1 != null || l2 != null){
            int oneVal = (l1 == null ? 0 : l1.val);
            int twoVal = (l2 == null ? 0 : l2.val);
            
            int sum = oneVal + twoVal + carry;
            
            carry = sum / 10;
            int lastDigit = sum % 10;
            
            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            
            l3 = l3.next;
        }
        
        if(carry > 0){
            l3.next = new ListNode(carry);
            //l3 = l3.next;
        }
        
        return dummyHead.next;
    }
}