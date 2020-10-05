// a binary tree is univalued if every node in the tree has the same value,
// return true if every node has the same value

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
    
    // create an array list of integers
    List<Integer> vals = new ArrayList();
    
    public boolean isUnivalTree(TreeNode root) {
        
        // use depth first search recusion on the root
        dfs(root);
        
        for(int v: vals) 
            
            // check if every value is not equal to the root
            // you could compare other nodes, but the root will always be 0 so its best to                 // compare against the first node that you see
            if(v != vals.get(0))
                return false;
        
            return true;
    }
        
        public void dfs(TreeNode node) {
            
            // if the node is not null
            if(node != null) {
                
                // add the value to the array list
                vals.add(node.val);
                
                // do a dfs of the left
                dfs(node.left);
                
                // do a dfs of the right
                dfs(node.right);
            }
        }
        
}
