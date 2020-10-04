// given a tring s formed by digits 0 through 9 and '#'. We want to map  to English lowercase
// characters as follows

/* 

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively. 
Return the string formed after mapping.

It's guaranteed that a unique mapping will always exist.


Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

*/

class Solution {
    public String freqAlphabets(String s) {
        
        // convert the string to a char array to hold each value
        char[] decode = s.toCharArray();
        
        // create a new string builder
        StringBuilder sb = new StringBuilder();
        
        // create a variable to hold the length of the char array
        int decode_size = decode.length;
        
        // loop through the length of the char array starting from the end
        for(int i = decode_size-1; i >= 0; i--){
            
            // if the character array contains '#'
            if(decode[i] == '#'){
                
                // formula to grab each value from j to z
                // int x = 1   -48            + 10 * 1  - 48  -> 11
                // 49 - 48                    + 10(49-48)
                // 1                         + 10   - 1  -> 10
                // k in ascii is 107, j is 106
                // a in ascii is 97
                int x = (decode[i-1] - '0') + 10*(decode[i-2] - '0') - 1;
                
                // convert the char to ascii
                // 97 + 9 -> 106 in ascii is j
                sb.append((char)('a'+x));
                
                // go back two since there's 2 values for j to z values
                i-=2;
            } else {
                
                // formula to grab a number from a to i
                // 97 + ((49 -48) - 1)
                // b in ascii is 98
                sb.append((char)('a'+((decode[i]-'0') - 1)));
            }
        }
        
        // return the reverse of the string builder since you went backwards in the for loop
        return sb.reverse().toString();
    }
}
