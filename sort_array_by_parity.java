// given an array A of non-negative integerrs, half of the integers in A are odd, and half of    // the integers are even. Sort the array so that the first number is even, the second is odd,
// and every number after follows the same pattern

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        
        int[] ans = new int[A.length];

        // first, read all the even integers and put them into place
        int t = 0;
        for (int x: A) if (x % 2 == 0) {
            ans[t] = x;
            t += 2;
        }
        
        // read all the odd integers and put them into place
        t = 1;
        for (int x: A) if (x % 2 == 1) {
            ans[t] = x;
            t += 2;
        }

        return ans;
    }
}
