// Convert a binary number in a linked list to an integer
// example:

/*

Input: head = [1,0,1]
Output: 5
Explanation: 101 in binary is equal to 5
    
*/

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
    public int getDecimalValue(ListNode head) {
        
        // create a new string buffer
        StringBuilder sb = new StringBuilder();
        
        // while the head is not equal to null
        while(head != null) {
            
            // add the current number to the string builder
            sb.append(head.val);
            
            // set the head equal to the next element in the linekd list
            head = head.next;
        }
        
        // return the integer value of the string that's currently in binary
        return Integer.parseInt(sb.toString(), 2);
    }
}
