// Given a string that conains '(', ')', '{', '}', '[' and ']', determine if the input string  is valid. By valid, meaning there's a closed parenthesis for each open parenthesis
// ({}) is an example of a true solution
// The solution is to create a stack and then loop through the stack from beginning to end and 
// pop off each valid entry

// time complexity: O(n) since we traverse the given string one character at a time
// space complexity:  O(n) as we push all brackets on the stack and the worst case is
// (((... forever


class Solution {
    
    // create a hash table that holds the values for the mappings
private HashMap<Character, Character> mappings;

// Initialize a hash map with mappings. This makes the code easier to read.
    public Solution() {
    this.mappings = new HashMap<Character, Character>();
    this.mappings.put(')', '(');
    this.mappings.put('}', '{');
    this.mappings.put(']', '[');
  }
    public boolean isValid(String s) {
       
    // initialize a stack to be used for the alogirthm
    Stack<Character> stack = new Stack<Character>();
        
    // loop through the input string and get each character
    for(int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        
        // check if the current character is a closing bracket
        if(this.mappings.containsKey(c)) {
            
// get the top element off the stack. If the stack is empty set the stack to a dummy value
            char topElement = stack.empty() ? '#' : stack.pop();
            
     // if the mapping for this bracket doesn't match the stack's top element return false
            if(topElement != this.mappings.get(c)) {
                return false;
            }
        } else {
            // if it was an open bracket, push to the stack
            stack.push(c);
        } 
      }
    // if the stack still contains elements, then is is an invalid expression
    return stack.isEmpty();
    }
}
