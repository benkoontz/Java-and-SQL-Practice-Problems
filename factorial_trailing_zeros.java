// Given an integer n, return the number of trailing zeroes in n!.


// n = 0 = 0 -> 0
// n = 1  = 0 -> 0
// n = 2 =  2 -> 0
// n = 3 = 6 -> 0
// n = 5 = 120 -> 1


class Solution {
    public int trailingZeroes(int n) {
        
    int count = 0;
    int temp = n;
        
    if (n == 0) return 0;
             
        while(temp != 0) {
            count += temp / 5;
            temp = temp / 5;
        }
        
        // n = 5
        // count = 0 + 5/5 = 1
        // temp = 5/5 = 1
        // count = 1 + 1/5 -> 0
        // temp = 1/5 -> 0
        
    return count;
    }
}
