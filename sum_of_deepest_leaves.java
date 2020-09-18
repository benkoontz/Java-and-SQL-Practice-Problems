// Given a binary tree return the sum of its deepest leaves.


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
    public int deepestLeavesSum(TreeNode root) {
        
    // create an int to hold the max level and pass in the root
    int maxLevel = getMaxLevel(root);
        
    // create a new tree node to hold he result
    TreeNode result = new TreeNode(0);
        
    // deepestLeavesSum(TreeNode root, int maxLevel, int level, TreeNode result)
    deepestLeavesSum(root, maxLevel - 1, 0, result);
        
    // return the result
    return result.val;
    }
    
    // create a function to get the deepest level
    public int getMaxLevel(TreeNode root) {
        
        // return 0 if the root is empty
        if (root == null) return 0;
        
        // get the max level of the left 
        int left = getMaxLevel(root.left);
        
        // get the max level of the right
        int right = getMaxLevel(root.right);
        
        // if left is greater than right, return left else return right
        // you add one because the root starts at 0
        return (left > right ? left : right) + 1;
    }
    
    // pass in the four values to get the sum
    public void deepestLeavesSum(TreeNode root, int maxLevel, int level, TreeNode result) {
        
        // return null if the root is empty
        if (root == null) return;
        
        // if the level is equal to the max level, add the value of the node
        if (level == maxLevel) {
            result.val += root.val;
        }
        
        // use recursion to get the value fo the left deepest node
        deepestLeavesSum(root.left, maxLevel, level + 1, result);
        
        // use recursion to get the value fo the right deepest node
        deepestLeavesSum(root.right, maxLevel, level + 1, result);
    }
    
}
