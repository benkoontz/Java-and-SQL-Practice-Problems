// You are given a root of a binary tree that has a value of 0 or 1. Each root to leaf path
// reporesents a binary number starting with the most significant bit. For example

// 01011 is 11 -> 0 -> 1 -> -> 0 -> 1 -> 1

// return the sum of each branch added together

// input [1, 0, 1, 0, 1, 0, 1
// output: 22
// Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22

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
    public int sumRootToLeaf(TreeNode root) {
        
        // create a value to hold the sum of each value
        int rootToLeaf = 0;
        
        // create a value to hold the current number
        int currNumber = 0;
        
        // create an arrayDeque to hold each pair
        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque();
        
        // push the pair to the stack
        stack.push(new Pair(root, 0));
        
        // while the stack is not empty
        while(!stack.isEmpty()) {
            
            // pop each pair
            Pair<TreeNode, Integer> p = stack.pop();
            
            //set  the root equal to the pair
            root = p.getKey();
            
            // set the current number = to the value of the paiir
            currNumber = p.getValue();
            
            // if the root is not empty
            if(root != null) {
                
                // set the current number = to onr binary value higher and add it to the
                // root.val value. The '|' is a bitwise or operator and shit the value 
                // one value to the left
                // example:   0 << 1  →  00
                // 0100 | 0011 -> 0111
                currNumber = (currNumber << 1) | root.val;
                
                // if it's a leaf, update root to leaf sum
                if(root.left == null && root.right == null) {
                    rootToLeaf += currNumber;
                } else { 
                    stack.push(new Pair(root.right, currNumber));
              stack.push(new Pair(root.left, currNumber));
            }
          }
        }
        return rootToLeaf;      
    }
}
