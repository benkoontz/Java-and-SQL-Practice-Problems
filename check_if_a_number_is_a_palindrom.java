// Check if an integer is a palindrome. A palindrom reads the same way forwards and backwards.
// Time complexity: The time complexity is O(log10(n)) since we divide the input by 10 for   // each iteration

class Solution {
    public boolean isPalindrome(int x) {
        
        // If the number is less than 0 the number isn't a palindrome, since it has a
        // - sign in front of the number
        // Also, if the nuber is divisble by 10, the number can't be a palindrome
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        // create a vaiable to hold the reverted number
        int reversedNumber = 0;
        
        // formula
        while(x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }
        
        // test 202
        // first round: reversedNumber = 0*10 + 202%10;
        // reversedNumber = 0 + 2
        // x = 202 / 10;
        // x = 20
        // second round: reversedNumer = 2*10 + 20%10
        // reversedNumber = 20
        // x = 2
        // x == reversedNumber/10, true
        
        // test 201
        // first round: reversedNumber = 0*10 + 201%10;
        // reversedNumber =  0 + 1
        // x = 201/10 = 20
        // second round: reversedNumber = 1*10 + 20%10
        // reversedNumber = 10
        // x = 20/10 = 2
        // x = 2 and reversedNumber = 10, false
        
        // 1. when the length is odd, we can get rid of the first digit by doing     
        // reversedNumber/10
        // 2. when the input is 202, at the of the while loop we get rid of 2
        // 3. since the middle digit doesn't matter, we can get rid of it
        
        return (x == reversedNumber || x == reversedNumber/10);
        
    }
}
