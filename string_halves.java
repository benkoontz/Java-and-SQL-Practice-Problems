// You are given a string s of even length, split this string into two halves of equal lenghts and let a be the 
// first half and be the second half. Two strings are alike if they have the same number of vowles
// (a, e i, o, u, A, E, I, O, U). Notice that s ontains uppercase and lowercase letters

class Solution {
    public boolean halvesAreAlike(String s) {
        
  // var can be used for declaring local variables, including index variables of for-loops and resource           // variables of the try-with-resources statement.
  // var cannot be used for fields, method parameters, and method return types. 
        
  var v = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        
        // create counting variables for the first half and the second half of the string
        int a = 0, b = 0;
        
        // i loops through the string starting at the begging
        // j loops through the strings starting at the end
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            // check how many characters in the first half of the string are vowels
            if (v.contains(s.charAt(i))) 
                a +=  1;
            // check how many characters in the second half of the string are vowels
            if(v.contains(s.charAt(j)))
                b +=  1;
        }
        return a == b;
    }
}
