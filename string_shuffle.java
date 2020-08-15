// given a string and a array of indices of the same length, shuffle the sting s such that
// the character at the ith position moves to indices[i] in the shuffled string

// example
// 2    3   4   0   1   (indices)
// h    e   l   o   l  (this is s)

class Solution {
    public String restoreString(String s, int[] indices) {
        
        // create a new character array to hold the final result
        char [] result = new char[indices.length]; 
        
        // loop through the indices
        for(int i = 0; i < indices.length; i++){
            
            // set the indeces equal the the values of where the characters are located
            result[indices[i]] = s.charAt(i);
        }
        
        // create an empty string
        String str = "";
        
        // loop through the array of indices
        for(int i = 0; i < indices.length; i++){
            
            // add each character to the resulting string
            str = str + result[i];
        }
        
        // return the resulting string
        return str;
    }
}
