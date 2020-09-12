// Given the root node of a binary search tree, return the sum of vaalues of all nodes with 
// the value between L and R

// Example 1:

// Input: root = [10, 5, 15, 3, 7, null, 18], L = 7, R = 15
// Output: 32 (since 10+15+7 = 32)


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

// the left value of a binary tree is smaller than the right value

// answer using recursion

class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        // base case
        if (root == null) return 0;
        
        // left branch excluded, check if the value is less than the left value
        // if yes, return the right value
        if (root.val < L) 
            return rangeSumBST(root.right, L, R); 
        
        // right  branch excluded,  check if the value is greater than the right value
        // if yes, return the left value
        if (root.val > R) 
            return rangeSumBST(root.left, L, R); 
        
        // count in both children.
        return root.val + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R); 
    }
}
