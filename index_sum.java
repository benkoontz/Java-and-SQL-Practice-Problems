// Given A sorted array and target value, return the index if the target is found.
// example [1,2,5,6], 5
// outputs 2 since its in the third place in the array
// If the index is not found, return the index of where the value should be.
// example [1,3,7], 8
// outputs 3 since it would be in the fourth place in the array

// assume the array has no duplicates

// Solution: This is a binary search problem
// Time complexity O(log(n))

class Solution {
    public int searchInsert(int[] nums, int target) {
    
    // first check the case where the target is greater than every value in the array
    // check if the target is greater than the last element of the array
    if(target > nums[nums.length-1]){
        // return the length of the array. This checks for a case like his
        // [1,3,4], 5, returns 4
        return nums.length;
    }
 
    // create a looping index
    int x = 0;
    // y represents the legnth of the array
    // for reference: .length of [cat, dog, fish] = 3
    int y = nums.length-1;
 
    // while x is less than the length of the array
    while(x < y){
        // create a formula where m is equal to 0 + (the length of the array - 0)/2
        // pretend the length is 3
        // m is equal to 0 +(3 -0)/2, return 1
        // m is equal to 1 + (3-1)/2, return 2
        // m is equal  to 3 + (3-2)/2, return 3 
        int m = x + (y-x)/2;
        // check if the target is greater than the current value in the array
        if(target > nums[m]){
            // the target is greater than the current value, so go to the next index
            x = m + 1;
        } else {
            // used for this case [2,5,6], 1, returns 0;
            y = m;
        }
    }
    // return the index
    return x;
    }
}
