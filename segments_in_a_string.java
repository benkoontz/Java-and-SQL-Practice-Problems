// give a string s , return the number of segments in the string. a segment is defined by a sequence of non-space
// characters.

/* Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
*/

class Solution {
 public int countSegments(String s) {
    
    // trim() elements leading a trailing spaces
    String count = s.trim();
     
        // if the string is empty return 0
        if (count.equals("")) {
            return 0;
        }
     
        // split("\\s+") will split the string into a string
        //   array and uses a space as a delimeter
        return count.split("\\s+").length;
    }
}
