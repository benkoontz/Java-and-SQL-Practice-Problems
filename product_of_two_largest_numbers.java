// given an array of integers called nums, choose two indices i and j of that array. Return the // maximum vaue of (nums[i] - 1)*(nums[j] - 1)

// example
// Input: nums = [3,4,5,2]
// Output: 12 
// Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum // value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 


class Solution {
    public int maxProduct(int[] nums) {
    
    // 2 ints to hold the 2 largest numbers
    int max1 = 0; // largest number
    int max2 = 0; // 2nd largest number

    for (int i = 0; i < nums.length; i++) {
     
        // if the current number is larger than the 2nd largest number
        if(nums[i] >= max2) { // 3 >= 0 -> yes
                              // 4 >= 0 -> yes
                              // 5 > = 3 -> yes
                              // 2 >= 4 -> no
            // if the current number is larger than the largest number
            if(nums[i]>=max1){ // 3 >= 0 -> yes 
                               // 4 > = 3 -> yes
                               // 5 >= 4 -> yes
                // set the 2nd largest number equal to the largest number
                max2 = max1; // max 2 = 0
                             // max 2 = 3
                             // max 2 = 4
                // set the largest number equal to the current number
                // the current number is the largest number because it was checked that it was
                // bigger than both the largest and 2nd largest numbers
                max1 = nums[i]; // max1 = 3
                                // max1 = 4
                                // max1 = 5
            }
            
            // else the 2nd largest number is equal to the current number, since its larger
            // than the 2nd largest number but not the largest number
            else max2 = nums[i]; 
        }
    }

    // return the result
    return (max1-1)*(max2-1); 
    }
}
