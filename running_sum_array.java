// given an array, return the running sum of the array as you loop through it
// for example the array [1, 2, 5, 6] would be [1, 3, 8, 14]

// time complexity O(n) since you're lineary looping through the array

class Solution {
    public int[] runningSum(int[] nums) {
        
        // create a new int array that holds the length of the nums array
        int [] result = new int[nums.length];
        
        // set the sum to 0
        int sum = 0;
        
        // loop through the nums array
        for (int i = 0; i < nums.length; i++)
        {
            // add the sum each time you loop through the array
            sum += nums[i];
            
            // set each new entry in the ray to the current sum
            result[i] = sum;
        }

            // return the resulting array
            return result;
        
    }
}
