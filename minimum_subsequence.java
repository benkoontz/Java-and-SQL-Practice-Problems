// given an array numbes, obtain a smaller form of the arrary whose sum of elements is greater
// than the sum of all the other elements

// example
// nums = [4, 3, 10, 9, 8]
// ouput [10,9]

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
      
    // create an array list that holds integers, this will be the result 
    List<Integer> result = new ArrayList<>();
    
    // sort the nums array from smallest to largest
	Arrays.sort(nums);
	
    // create a variable to hold the sum
	int sum = 0; 
    
    // create a variable to hold the current sum
    int current_sum = 0;
        
    // create a for loop that calculates the sum
	for(int val: nums) sum += val;
	
    // loop through the array from the end to the beginning, you loop from the end because
    // the largest values are at the end of the array
	for(int i = nums.length - 1; i >= 0; i--) {
		current_sum += nums[i];
		sum -= nums[i];
        
        // add the new value to the result
		result.add(nums[i]);
        
        // if the current sum is largers than the sum of the remaining numbers then return
        // the result
		if(current_sum > sum) return result;
	}		
	return result;
}
}
