// write a function that reverses a string. The input string is in the form of a character
// array

// Input: ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

// solution, use two pointers, so swap two values at once through each iteration

class Solution {
    public void reverseString(char[] s) {
        
        // create a variable to hold the indices starting from the left
        int left = 0;
        
        // create a varable to hold the indices starting from the right
        int right = s.length - 1;
        
        // while the left value is less than the right
        while (left < right) {
            
            // get the char value on the left of the character array
            // temp = 'h'
            char temp = s[left];
            
            // set h to the end of the string
            s[left++] = s[right];
            
            // set o to the beginning of the string
            s[right--] = temp;
        }
    }
}
