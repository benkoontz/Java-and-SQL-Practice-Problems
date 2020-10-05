// given an integer n, reutrn any array containing n unique integers such that they add up to 0

/*
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
*/

class Solution {
    public int[] sumZero(int n) {
        
    // create a new int array and sent the size equal to n
    int[] result = new int[n];
        
    // loop through half the length of the arry
	for(int i = 0; i < result.length/2; i++) {
        
        // set the result equal to the negative index -2
        // result[0] -> -2
        // result[1] -> -3
		result[i] = -i - 2;
        
        // result[2 + 0] = 0 + 2 -> 2
        // result[2 +1] -> 1 + 2 -> 3
		result[result.length/2 + i] = i + 2;
	} 
    // output [-2,-3,2,3,0]
	return result;
    }
}
