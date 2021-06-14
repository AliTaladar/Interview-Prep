class Solution {
    public int getDecimalValue(ListNode head) {
        String number = "";
        
        ListNode current = head;
        
        while(current != null){
            number += String.valueOf(current.val);
            current = current.next;
        }        
        
        int decimal = Integer.parseInt(number, 2);
        
        return decimal;
        
    }
}