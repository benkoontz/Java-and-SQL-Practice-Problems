// construct a string consiting of parenthesis and integers from a binary tree with the 
// preorder traversing way

/* 

Input: Binary tree: [1,2,3,null,4]
       1
     /   \
    2     3
     \  
      4 

Output: "1(2()(4))(3)"
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
    public String tree2str(TreeNode t) {
        
        // base case where you would return an empty strinyg
        if (t == null)
            return "";
        
        // case that checks if the node is a leaf
        if (t.left == null && t.right == null)
            return t.val + "";
        
        
        // if the right node is null return the tree value + ( + the left node value + )
        if (t.right == null) 
            return t.val + "(" + tree2str(t.left) + ")";
        
        // recursion case when there's both left and right values
        // return the current value + ( + the left node value + )()
        //  + the right node value + )
        return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
        
    }
}
