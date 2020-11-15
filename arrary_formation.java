// given an array of distinct integers arr and an arrary of integer arrays pieces, where the integers pieces are 
// distinct, your goal is to form arr by concatenating the arrays in pieces in any order. Howev

/*
Example 1:

Input: arr = [85], pieces = [[85]]
Output: true
Example 2:

Input: arr = [15,88], pieces = [[88],[15]]
Output: true
Explanation: Concatenate [15] then [88]
Example 3:

Input: arr = [49,18,16], pieces = [[16,18,49]]
Output: false
Explanation: Even though the numbers match, we cannot reorder pieces[0].
*/

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        
    // create a hashmap (key, value)
    Map<Integer, int[]> map = new HashMap<>();

    // map out each sub array
    for(int[] piece : pieces)
        map.put(piece[0], piece);
    
    int index = 0;
    
    // loop through the array
    while(index < arr.length){
        if(!map.containsKey(arr[index]))
            return false;
        
        // create an int array to hold each value of rr
        int[] p = map.get(arr[index]);
        
        // loop through the int array p
        for(int i = 0; i < p.length; i++){
            // if the array value of arr is not equal to the array value of p return false
            if(arr[index++] != p[i])
                return false;
        }
    }
    return true;
}
}
