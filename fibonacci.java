// A Fibonacci number is number that's sum is equal to the two preceding nnumbers
// Given N, calculate F(N)

// Input: 4
// Output: 3
// Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.


// solution, use recursion
class Solution {
    public int fib(int N) {
        
        // N = 4 example
        
        if(N <= 1) {
            return N;
        }
        
        // fib(4 - 1) + fib(4 - 2)
        // fib (3)   + fib(2)
        // fib (3 -1) + fib (2 - 2)
        // fin (2)  + 2
        // fib (2 -1) + 2
        // fib 1 + 2 -> 3
        return fib(N - 1) + fib(N - 2);
    }
}
