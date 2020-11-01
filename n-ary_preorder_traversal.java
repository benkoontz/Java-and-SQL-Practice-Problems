/* given an n-ary tree, return the preorder traversal of its nodes' values

In a N-ary tree, preorder means visit the root node first and then traverse the subtree rooted at its children one by one. For instance, the preorder of the 3-ary tree above is: A->B->C->E->F->D->G.

Input: root = [1,null,3,2,4,null,5,6]
Output: [1,3,5,6,2,4]


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
    public List<Integer> preorder(Node root) {
      
    // create an array list of integers
    List<Integer> list =  new ArrayList<>();
        
        // if the root is empty, return the list
        if(root == null) {
            return list;
        }
        
        return preOrder(root, list);
    }
    
    private List<Integer> preOrder(Node n, List<Integer> list) {
        
        // if the node is null, return the list
        if(n == null) {
            return list;
        }          
        
        // add the node to the list
        list.add(n.val);
        
        // loop through the children nodes
        for(Node node: n.children) {
            
            // call preOrder on the node and list
            preOrder(node, list);
        }  
                  
        // return the list
        return list;
    }
}
