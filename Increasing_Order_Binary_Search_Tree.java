// Given a binary search tree, rearrange the tree in order so that the lefmost noder in the // // tree
// is now the root node of the tree, and every node has no left chid and only 1 right child

// example 
/*
Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]

       5
      / \
    3    6
   / \    \
  2   4    8
 /        / \ 
1        7   9

Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

 1
  \
   2
    \
     3
      \
       4
        \
         5
          \
           6
            \
             7
              \
               8
                \
                 9  
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
    public TreeNode increasingBST(TreeNode root) {
        
        // create an array list of Integers
        List<Integer> vals = new ArrayList();
        
        // call the inorder function and pass in a root and values
        inorder(root, vals);
        
        // create a tree node to hold the answer
        TreeNode answer = new TreeNode(0);
        
        // set the current tree node equal to the answer
        TreeNode current = answer;
        
        // loop through the values
        for (int v: vals) {
            
            // set the current value on the right equal to the new tree node
            current.right = new TreeNode(v);
            
            // the current value is equal to the right value
            current = current.right;
        }
        
        // return the list of values on the right
        return answer.right;
    }

    // create a new function to sort the values in order, use recursion
    public void inorder(TreeNode node, List<Integer> vals) {
        
        // if the current node is null, then exit
        if (node == null) return;
        
        // call the function and pass in the left node
        inorder(node.left, vals);
        
        // add the values to the current node
        vals.add(node.val);
        
        // call the inorder function and pass the valu
        inorder(node.right, vals);
    }
}
