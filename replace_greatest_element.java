// given an array arr, replcae every element in that array with the greatest element among the elements
// to its right, and replace the last element with -1

/*

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]

input:
[5,4,3,2,1]

Output:
[4,3,2,1,-1]

*/

class Solution {
    public int[] replaceElements(int[] arr) {
        
        // create an array to hold the result
        int [] result = new int[arr.length];
        
        // create an integer to hold the max element
        int max;
        
        // loop through all the elements except the last element 
        // since the inside loop will be one step ahead
        for(int i = 0; i < arr.length - 1; i++){
      
            max = 0;    
            
            // loop through the element after i (used to find the next max element in the array)
            for(int j = i + 1; j < arr.length; j++){ 
                
                // first round, i = 0, j = 1
                // max = 18 -> found max element
                
                // second round, i = 1, j = 2
                // max = 5
                // max = 5
                // max = 6 -> found max element
                
                // third round, i = 2, j = 3
                // max = 6 -> found max element
                
                // set the max either to the current element or the current max element
                max = Math.max(arr[j], max);     
            }
            
            // set result = to the max element
            result[i] = max;
            
            // result [0] = 18
            // result [1] = 6
            // result [2] = 6

        }
        // set the last element to -1
        result[result.length-1] = -1;
        
        return result;
    }
}
