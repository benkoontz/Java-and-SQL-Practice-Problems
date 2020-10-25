// given a binary tree, find its minimum depth
// the minimum depth is the number of shortest paths from the root nood to any leaf node
// a leaf is a node with no children



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
    public int minDepth(TreeNode root) {
        
    // if the root is null than the depth is 0
    if(root == null) return 0;
        
    // 3  -> 1 + Math.min(minDepth(9), minDepth(20))
    // 9 -> 2 + Math.max(minDepth(null), minDepth(null))
		
    // if the left or right node are null
    if(root.left == null || root.right == null)
        // return 1 + the max depth of the left or right node
            return 1 + Math.max(minDepth(root.left), minDepth(root.right));
	
    // return 1 + the min  of the left or right node
    return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
