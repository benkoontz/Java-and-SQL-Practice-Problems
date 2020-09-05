// Given two arrays nums and index, create a target array that inserts values into a new array

/* example:
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2] */


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        // create an array list of integers to hold the result
        List<Integer> result = new ArrayList<>();
        
        // loop through the nums array
        for(int i = 0; i < nums.length; i++) {
            
            // add(int index, E element)
   // Inserts the specified element at the specified position in this list (optional operation).
            result.add(index[i], nums[i]);
        }
        // create an array to hold the answer and map the results
        int[] answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
