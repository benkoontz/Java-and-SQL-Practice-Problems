class Solution {
    public boolean isPalindrome(String s) {
        
    // create two variable for the left and right of the string
    int left = 0; 
    int right = s.length() - 1;
        
      // check the case where the string is empty
      if(s == null || s.trim().isEmpty()) return true;
        
        // convert the string to a char array
        char[] cs = s.toCharArray();
        
        // while the left is less than the right
        while(left < right){
            
        // while the left is less than the length of the array and there's not a valid char
        while(left < cs.length && !validChar(cs[left])) left++;
            
        // while the right is greater than or qual to 0 and
        // there's not a valid char
        while(right >= 0 && !validChar(cs[right])) right--;
            
        // if left is <= right and the characters don't match, return false
        // checks whether the length is odd and if the characters maatch
        if(left <= right && Character.toUpperCase(cs[left++]) != Character.toUpperCase(cs[right--])) 
                return false;
        }
        
        return true;
    }
    
    // create a function that checks for ascii values
    private boolean validChar(char c){
        return ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122));
    }
}
