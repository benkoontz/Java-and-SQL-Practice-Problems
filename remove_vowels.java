// remove vowels from a string
// example "doyoulikepizza" => "dylkpzz"

// Time Complexiity O(n) since you iterate through the sring from beginning to ened

import java.io.*;
import java.util.*;

public class Solution {
	
	  public String removeVowels(String S) {
		  
      // Construct a string builder
		  StringBuilder result = new StringBuilder();
      
      // create a character set to hold each of the vowels
		  Set<Character> vowels = new HashSet<Character>();
      // add all the vowels to a hashset
		  vowels.add('a');
		  vowels.add('e');
		  vowels.add('i');
		  vowels.add('o');
		  vowels.add('u');
      
      //iterate through the input string character by character and store it in a character array
		  for(char c : S.toCharArray())
		  {
        //if the current character is not a vowel, then append it to the new string
			  if(!vowels.contains(c))
			  {
          // append each character to the result
				  result.append(c);
			  }
		  }
        //convert the result back to a string since the method has a return type of type String
	      return result.toString();
	    }
}
