// given a non empty, singly linked linked list with head node head, return a middle node of 
// the linked list. If there are two middle nodes, return the second middle node

// The number of nodes in the given list will be between 1 and 100.
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
    public ListNode middleNode(ListNode head) {
        
        // set two list nodes equal to head
        ListNode slow = head, fast = head;
        
        // while both nodes aren't equal to null
        while(fast != null && fast.next != null) {
            
            // set slow equal to the next node
            slow = slow.next;
            
            // set fast equal to the next next node
            fast = fast.next.next;
        }
        
        // return slow, this will be half since fast has ended 2x ahead of slow
        return slow;
    }
}
