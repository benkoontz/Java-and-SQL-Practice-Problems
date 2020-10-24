// given a string S of lowercase letters, a duplicate removal consits of choosing to adjacent and equal letters
// and removing them.

// example:
// abbaca -> aaca -> ca

class Solution {
    public String removeDuplicates(String S) {
    
   //  create a character stack
   Stack<Character> stack = new Stack<>();
        
        // loop through the length of the string
        for (int i = 0; i < S.length(); i++) {
            
            // if the stack is not empty and the next character is equal the current value pop the value
            if (!stack.isEmpty() && stack.peek() == S.charAt(i)) 
                stack.pop();
            // else push the alue on the stuck
            else 
                stack.push(S.charAt(i));
            
            // push a -> a
            // push b -> ab
            // pop b -? a
            // pop a -> null
            // push c -> c
            // push a -> ca
        }
        
        // create a string builder to build the result
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) 
            sb.append(c);
        
        // return the string
        return sb.toString();
    }
}
