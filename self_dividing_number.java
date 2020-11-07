// a self dividing number is a number that is divisible by every digit it contains, given a list from left to right, return each value in the list if it's a self dividing number

/*

Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        // create a arrary list to hold the answer
        List<Integer> ans = new ArrayList();
        
        // loop through each number from left to right
        for(int n = left; n <= right; n++) {
            
            // if the number is self dividing then add the number to the array list
            if(selfDividing(n)) ans.add(n);    
        }
        return ans;
    }
    
    
    public boolean selfDividing(int n) {
        for(char c: String.valueOf(n).toCharArray()) {
            // if c is equal to 0 or n % (c - 0) > 0
            // check if the number is self dividing
            if(c == '0' || (n % (c - '0') > 0))
                return false;
    } 
    // if it is self dividing then return true
    return true;
}
}
