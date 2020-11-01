/*
// given an integer n, return a string with n character such that each character in  the string occuras an odd
// number of times. The returned string must contain only lowercase English letters. If there are multiple valid 
// strings, return an of them

Input: n = 4
Output: "pppz"
    
*/

class Solution {
    public String generateTheString(int n) {
        
    // create a stringbuilder of size n to create the string
    // stringbuilder starat at index 0, so if n = 10 then there's really 11 elements
    StringBuilder sb = new StringBuilder(n);
    
        // while the length of the string - 1
        // you do -1 because you're going to add or subtract a final new character to make either a or b odd
        while (sb.length() < n - 1) {
            sb.append('a');
        }
        
        // if there's an odd number of elements, then add b
        if (n % 2 == 0) {
            sb.append('b');
        } 
        // if there's an even number of elements than add another a
        else {
            sb.append('a');
        }
        
        // return the resulting string
        return sb.toString();
    }
}
