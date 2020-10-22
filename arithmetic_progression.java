// given an array of numbers arr, a sequence of number is callaed an arithemetic progression if  // the difference between any two consective elements is the same

// [1,2,3,4,5] -> true
// [1,2,3,4,6] -> false

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
       
    // sort the arrary from smallest to larargest
    Arrays.sort(arr);
        
    int diff = arr[1] - arr[0]; // -> 1
        
    // start at the 3rd index
    for (int i = 2; i < arr.length; ++i)
      if (arr[i] - arr[i - 1] != diff) 
         return false;
        
    return true;
  }
}
