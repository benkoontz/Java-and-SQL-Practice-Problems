//  Here is the alphabent converted to morse code:

/* 

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

return the total number of unique transformations for a set of strings in the arrary words

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
*/


class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        // create a string array to hold the alphabet coverted to morse code
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        
        // create a hashset to hold each unique transformation
        // a hashset is good for this because it will disregard duplicates
        Set<String> seen = new HashSet();
        
        // loop through each of the words
        for(String word: words) { // gin
            
            // create a new string builder
            StringBuilder code = new StringBuilder();
            
            // for each charcter in words, convert it to a char array
            for(char c: word.toCharArray()) // [g, i, n]
                // add each more code chacter 
                code.append(morse[c - 'a']); // suppose the char c is g, a represent 97
                                             // this will return 104 - 97 since g is represnted
                                             // as 104 in ascii -> morse[7]
            
            // add each morse code to the hashset
            seen.add(code.toString());
        }
        
        // return the the size of the hashset
        return seen.size();
    }
}
