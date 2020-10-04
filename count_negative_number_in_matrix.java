// Given a m * n matrix grid which is sorted in non-increasing order both row-wise and // // // // column-// wise. 

// Return the number of negative numbers in grid.

// Input: grid = [[1,-1],[-1,-1]]
// Output: 3

class Solution {
    public int countNegatives(int[][] grid) {
          
        // create a variable to hold the answer
        int answer = 0;
        
        // loop through the length of the grid -> 2
        for(int i = 0; i < grid.length; i++){
            
            // if the first number is negative then the length is the answer because
            // the rest of the numbers will be negative
            if(grid[i][0] < 0){ // [1][0] -> -1
                
                answer += grid[i].length;//  -> 2
                continue; // you use continue because you don't have to check for other values
            }
            
            // j is 1 because you already check for the first value in the sub arrays
            // loop through each sub array
            for(int j = 1; j < grid[i].length; j++){ 
                
                if(grid[i][j] < 0){ // i remains the same and j increases
                    
                    answer += grid[i].length - 1 - j + 1; // -> 2 -1 - 1 + 1 -> 1
                                                          // -> 4 - 1 - 2 + 1 -> 1
                                                          // -> 4 - 1- 3 + 1
                    break;
                }
            }
        }
        return answer;
        
    }
}
