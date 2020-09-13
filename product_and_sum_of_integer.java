// Given an integer n, return the difference between the product of its digits and the sum 
// of it's digits

/*

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

*/

// solution: use different arithmetic operators to get each of the numbers


class Solution {
    public int subtractProductAndSum(int n) {

// n = 234
// n % 10 = 234 % 10 = 4
// n /= 10 = 234 /=10 = 23 = 2 = 0


int sum = 0; // used to code the sum
int product = 1; // any number multipled by 0 = 0

    while (n > 0) {
	    int digit = n % 10; // n = 4
	    sum += digit; // sum = 4
	    product *= digit; // product = 1 * 4
	    n /= 10; // n = 234/10 = 23
    }
        
    // return the product minus the sum
    return product - sum;
  }
    
}
