// Given a string s, return the maximum number of balanced strings in the string
// input s = "RLRRLLRLRL"
// Output: 4

class Solution {
    public int balancedStringSplit(String s) {
        
        // set a result to return the result
        int result  = 0;
        
        // create a counter to count if there's an equal number of preceeding L's and R's
        int counter = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            // if you find an 'L' add one to the counter
            if (s.charAt(i) == 'L') {
                counter++;
                
            // if you find a 'R' subtract one from the counter
            } else {
                counter--;
            }
            
            // if the counter is equal to 0, you add 1 to the result becaus that means you 
            // found an equal number of L's and R's
            if (counter == 0) {
                result++;
            }
        }
        
        // return the result
        return result;
    }
}
