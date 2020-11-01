/* given an n-ary tree, return the postorde traversal of its nodes' values

In a N-ary tree, postorder means traverse the subtree rooted at its children first and then visit the root node itself. For instance, the postorder of the 3-ary tree above is: B->E->F->C->G->D->A.

Input: root = [1,null,3,2,4,null,5,6]
Output: [5,6,3,2,4,1]

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
    public List<Integer> postorder(Node root) {
        
    List<Integer> list = new ArrayList<>();
        
      if(root == null) {
            return list;
        }
        
    return postOrder(root, list);
    }
    
    private List<Integer> postOrder(Node n, List<Integer> list) {
        
        if(n == null) {
            return list;
        }
            
        for(Node node: n.children) {
            postOrder(node, list);
        }  
        
        // add the node after, in pre-order you add it before
        list.add(n.val);
                    
        return list;
    }
}
