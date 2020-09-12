// given the array nums, for each nums[i] find out how many numbers in the array are smaller // // than it. That is, for each nums[i], count the number of valid j's such that j != i and / // // nums[j] < nums[i]

// example

/* Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
*/


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
