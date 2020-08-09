// Given a array of integers, return the indices of the two numbers that add up to a target value. // For example, if the array is [0, 2, 5] and the target is 7, 
// then return [1,2].

// solution: use a double for loop
// time complexity: O(n^2)
// The time complexity for index i is O(n). Finding the complement of i takes O(n^2)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // loop through the array to find the first index
        for(int i = 0; i < nums.length; i++){
            // loop through the array a 2nd time to find the next index
            for(int j = i + 1; j < nums.length; j++) {
                // if the value for the 2nd index is equal to the target minus the first index
                // return the indices
                if (nums[j] == target - nums[i]) {
                return new int[] {i,j};
                }
            }
        }
        // throw an exception if there is no solution. This is to prevent program disruuption
         throw new IllegalArgumentException("No two sum solution");
    }
}
