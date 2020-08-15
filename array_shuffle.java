// given the input array consiting of the form [x1, x2...xn, y1, y2,...yn],
// return the array of the form [x1, y1, x2, y2,...,xn, yn]
// example [2. 5. 1. 3. 4, 7], n = 3
// result [2. 3. 5. 4. 1. 7]
// since x1 = 2, x2 = 5, x3 = 1, y1 = 3, y2 = 4, y3 = 7


class Solution {
    public int[] shuffle(int[] nums, int n) {
        
     // create a new int arrary which will hold the same length as the input array,
    // since it's only shuffling the values
    int [] output = new int[nums.length];
        
        
    // x points to left side: 0 to n.
		// y points to right side: n to end of the array.
		// d is the destination index in the output array for each pair, stept by 2 on
		// each iteration to store the new pairs (Xn,Yn) .
		// The array iterates from X until n, as when reaching n all pairs
		// from both sides (left and right) will have been obtained.
        
		// y = n because its half of the array until the end
        // x < n because n is its half of the array
        // you add 2 to d every time because its for each pair
        for (int x = 0, y = n, d = 0; x < n; x++, y++, d +=2)
        {
            // store each x value
            output[d] = nums[x];
            
            // add 1 to store the y value, since its one right the the x value
            output[d+1] = nums[y];
        }            
        // return the new array
        return output;
    }
}
