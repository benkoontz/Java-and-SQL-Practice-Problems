// Given a non negative interger number num, return the number of steps to reduce it to zero.
// If the current number is even, you have to divide it by 2, otherwise, you have to subtract 
// 1 from it

// example: num = 14
// ouput: 6
// Explanation: 
// Step 1) 14 is even; divide by 2 and obtain 7. 
// Step 2) 7 is odd; subtract 1 and obtain 6.
// Step 3) 6 is even; divide by 2 and obtain 3. 
// Step 4) 3 is odd; subtract 1 and obtain 2. 
// Step 5) 2 is even; divide by 2 and obtain 1. 
// Step 6) 1 is odd; subtract 1 and obtain 0.


class Solution {
    public int numberOfSteps (int num) {
        
        // set a counting variable equal to 0 to hold the count
        int count = 0;
        
        // while the number isn't equal to 0
        while(num != 0) {
            
            // check if the number is divisible by 2
            if(num % 2 == 0) {
                num /= 2;
                count ++;
            }
            // if the number isn't divisible by 2, subtract 1 because then it's an odd number
            else {
                num -= 1;
                count ++;
            }
        }
        // return the count
        return count;
    }
}
