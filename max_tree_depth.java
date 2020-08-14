// Find the maximum depth of the binary


class Solution {
    public int maxDepth(TreeNode root) {
        
        // if the there is no root node, the depth is equal to 0
        if (root == null)
            return 0;
    
    // create a node to hold find the max depth on the left branch
    int leftDepth = maxDepth(root.left);
        
    // create a node to fold the max depth on the right branch
    int rightDepth = maxDepth(root.right);
 
    // return the max depth of either the righ or left
    int bigger = Math.max(leftDepth, rightDepth);
 
    // add 1 to the depth because the root node starts at 0
    return bigger+1;
        
    }
}
