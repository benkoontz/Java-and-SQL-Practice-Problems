/* Given two binary trees, imagine that you want to overlap them. The sum of each overlap will
equal the new value of the node


input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  

Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        // if the value of the nodde for tree 1 is null, then the value for the node will be t2
        if(t1 == null)
            return t2;
        
        // if the value of the nodde for tree 2 is null, then the value for the node will be t1
        if(t2 == null)
            return t1;
        
        // add the value of tree 2 to tree 1
        t1.val += t2.val;
        
        // recursion, set the left value of t1 = t1 left, t2, left
        t1.left = mergeTrees(t1.left, t2.left);
        
        // recursion, set the right value of t1 = t1 right, t2, right
        t1.right = mergeTrees(t1.right, t2.right);
            
        // tree 1 will serve as the result
        return t1;
        
    }
}
