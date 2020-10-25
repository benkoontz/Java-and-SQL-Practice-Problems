// remove all elements from a linked list of integers that have a value val

/*
Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
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
    public ListNode removeElements(ListNode head, int val) {
        
        // Set pointers.
        ListNode current, prev; 
        
        // Check if the first element in the list is the one (and only) that we are looking for. 
        while(head != null && head.val == val) 
        {
            head = head.next;
        }
		
        // Assign the pointers to the head.
        prev = head;  
        current = head;
        
        // While we have not reached the end of the list.
        while(current != null) 
        {
            // if the value  is found
            if (current.val == val) 
            {  
                // Move the the 'prev' pointer so that the next element of 'prev' will be the next element of 'current' instead current itself 
                prev.next = current.next; 
            }
            // (prev is following 'current'), thus 'skipping' the element thats needs to be removed. 
            else 
            {  
                // Else 'prev' pointer will point at the same element as 'current'.
                prev = current; 
            }      
            // Move the 'current' pointer the the next element (next iteration).
            current = current.next; 
            
            
        } 
        // Return the new list.
        return head; 
    } 
}
