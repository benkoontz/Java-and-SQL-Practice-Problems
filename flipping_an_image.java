// given a binary matrix A, flip the image horizontally and then invert it
// to flip an image horizontally means that each row of the image is reversed\
// to invert an image means that each 0 is replaced by 1 and each 1 is replaced by 0

/*

Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]

*/

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        // get the length of one of the individual arrays
        int C = A[0].length;
        
        // We use (C+1) / 2 (with floor division) to iterate over all indexes i in the first half of the row,           // including the center.
        // loop through each row
        for(int[] row: A)
            for(int i = 0; i < (C + 1) / 2; ++i) {
                // the ith value from the left is equal to the inverse of the ith value from the right.
                // ^ is for exclusive  or
                int temp = row[i] ^ 1; // 
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = temp;
        }
    return A;
    }
}
