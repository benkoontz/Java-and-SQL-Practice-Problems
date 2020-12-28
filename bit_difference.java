// Given two integers x and y, determine the number of bits that are different between the two numbers

// example: x = 1, y = 4
// 0001 -> 1
// 0100 -> 4
// output -> 2 sine two bits are different between the numbers

class Solution {
    public int hammingDistance(int x, int y) {
        
    // ^ is the xor operator, use this operator on the two numbers
    // xor will set a digit to 1 if only one of the digits is 1, thus there is a difference that's present
    int result = x ^ y;
        
        // convert the result variable to a binary number
        String resultBinaryString = Integer.toBinaryString(result);
        
        // create an int variable to hold the difference
		int difference = 0;

        // loop through the length of the binary string
        for (int i = 0; i < resultBinaryString.length(); i++){
            // if there is a difference, then add one to the difference
            if (resultBinaryString.charAt(i) == '1'){
                difference++;
            }
        }
        // return the difference
        return difference;
    }
}
