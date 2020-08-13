// Suppose there's two link lists. Return the two linked lists as one linked list                // and return the nodes in sorted order.



class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
   
   // create a head lst node
   ListNode head = new ListNode(0);
    ListNode p = head;
 
    // create a node for the first list and the second list
    ListNode p1 = l1;
    ListNode p2 = l2;
        
    // while the first list node and the 2nd list node != null 
    while(p1 != null && p2 != null){
        // if the 1st list node is smaller
        if(p1.val < p2.val){
            // assign the next next list value 
            p.next = p1;
            // move to the next list node in list 1
            p1 = p1.next;
        }   
        // else assign the value from list 2
        else{
            p.next = p2;
            // move to the next lis node in list 2
            p2 = p2.next;
        }
        // assign the next vlue in the list (could be from list 1 or 2)
        p = p.next;
    }
    // check if the first list isn't empty, this checks for the last value
    if(p1 != null){
        p.next = p1;
    }
 
    // check if the second list isn't empty, this checks for the last value
    if(p2 != null){
        p.next = p2;
    }
 
    // return the result    
    return head.next;
}
