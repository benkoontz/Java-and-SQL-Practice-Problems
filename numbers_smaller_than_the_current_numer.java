// given the array nums, for each nums[i] find out how many numbers in the array are smaller // // than it. That is, for each nums[i], count the number of valid j's such that j != i and / // // nums[j] < nums[i]

// return the answer as an int array


class Solution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
     
    // create an int array to hold the answer
    int[] answer = new int[nums.length];
      
    // create an int array to hold the count
    int[] count = new int[101];
      
    // create a variable to hold the sum
    int sum = 0;
      
    // create a variable to hold the presum
    int[] preSum = new int[101];
      
    // loop through the nums array to count the number of numbers
    for (int num: nums) {
      count[num]++;
    }
       
    // loop through the length of the count array and set each  value 
    for (int i = 0; i < 101; i++) {
      // set the presume equal to the sum
      preSum[i] = sum;
    
      // sadd the sum for each count 
      sum += count[i];
    }
     
    // loop through the nums array  and set the answer  equal to the
    // presum of each value in the nums array
    for (int i = 0; i < nums.length; i++) {
      answer[i] = preSum[nums[i]];
    }
      
    // return the answer  
    return answer;
  }
}
