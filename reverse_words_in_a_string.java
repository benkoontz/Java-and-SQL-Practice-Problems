// given a string, reverse the characters in each of the words.

class Solution {
    public String reverseWords(String s) {
        
        // create a String arrary and split each of the words.
        // s.split(" ") is taking each word by detecting a space between each word
        String words [] = s.split(" ");
        
        // Create a string builder to hold the result
        StringBuilder result = new StringBuilder();
        
        // loop through each of the words
        for(String word: words)
            // created a string builder that reverses each of the words and outputs the form
            // into a string
            result.append(new StringBuffer(word).reverse().toString() + " ");
        
        // return the new string
        // trim() eliminates leading a trailing spaces of a string
        return result.toString().trim();
    }
}
