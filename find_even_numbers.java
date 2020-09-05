// Given an array of nums of integers, return how many of them contain an even number of digits

// input: nums = [12, 345, 2, 6, 7896]
// ouput: 2 


class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            
            // convert the integer to a string
            String str = Integer.toString(number);
            
            // note: strings use .length()
            
            if (str.length() % 2 == 0)
                count++;
        }
        return count;
     }
         
}
