// Given an N-ary tree, return the max depth of the N-ary tree. A N-ary tree is a tree that can
// have N number of children for each node. 

/* 
Input: root = [1,null,3,2,4,null,5,6]
Output: 3

*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        
        // create a variable to hold the result
        int result = 0;
        
        // recursion base case, the root is null so return 0
        if(root == null)
            return 0;
        
        // for loop through all the nodes 
        for(Node i: root.children)
            // the result is equal to the max of either result 
            result =  Math.max(result ,maxDepth(i));
        
        // return the result + 1 since the root node starts at 0
        return result + 1;
    }
}
