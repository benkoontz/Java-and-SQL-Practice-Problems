// given an array integers called nums, count all pairs in the array such that 
// nums[i] == nums[j] and i < j

class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        // set the initial count equal to 0
        int count = 0;
        
        // loop through the entire array starting at index 0
        for(int i = 0; i < nums.length; i++) {
            
            // loop through the entire array starting at index 1. You start at index + 1                   // because  you're starting at the second value in the array.
            for(int j = i+1; j < nums.length; j++) {
                
                // check if the values are equal
                if(nums[i] == nums[j]) {
                    
                    // increase the total count
                    count++;
                }
            }
        }
        
        // return the total count
        return count;
    }
        
}
