// given an array of positive integers arr, calcuate the sum of all possible odd-length // // // // subarrays. 


// example Input: arr = [10,11,12]
// Output: 66

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
    // create a variable to hold the sum   
    int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
        
            // create a variable to hold the end of the array
            int end = i + 1; // 0 + 1 = 1
                             // 1  + 1 = 2
                             // 2 + 1 = 3
        
            // create a variable to hold the start of the array
            int start = arr.length - i; // 3 -1 = 2
                                        // 3 - 2 = 1
                                        // 3 - 2 = 1
        
        
            int total = start * end;  // 2 * 1 = 2
                                      // 1 * 2 = 2
                                      // 1 * 3 = 3
        
            int odd = total/2;  // 2/2 = 1
                                // 2/2 = 1
                                // 3/2 = 1
        
        if (total % 2 == 1) {  
            odd++; // odd  = 2
                   // odd =  2 
                   // odd = 2
        } 
        
        sum += odd * arr[i]; // 2 * 10 = 20
                             // 2 * 11 = 22 -> 42
                             // 2 * 12 = 24 -> 66
        }
        return sum;
    }
}
