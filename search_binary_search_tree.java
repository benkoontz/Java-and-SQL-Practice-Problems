// given the root of a binary search tree, return the value you're looking for and the subtree
// if the value doesn't exist return null.

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
    public TreeNode searchBST(TreeNode root, int val) {
        
        // return null if the answer is null
        if(root == null)
            return null;
        
        // if the root is equal to the value then return the root
        if(root.val == val)
            return root;
        
        // if the root value is larger than go left
        else if(root.val > val)
            return searchBST(root.left,val); // recursion
        
        // else return the value on the right
        else 
            return searchBST(root.right,val); // recursion
    }
} 
