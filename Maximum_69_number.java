// given a positive integer consitiing of only the numbers 6 and 9,  return the maximum
// number you can get by changing at most one digit to 9

// example:

// Input: num = 9669
// Output: 9969

class Solution {
    public int maximum69Number (int num) {
    
      // create an integer array to hold a large integer number
      int arr[] = new int[4];
        
        // create a variable to hold the max length of the number
        int i = 3;
        
        // create a boolean that's initially set to false
        boolean changed = false;
        
        // create a while loop to grab each digit
         // 9969
        while(i >= 0)
        {
            int remainder = num % 10; // remainder = 9
            num = num/10; // num = 9960
            arr[i] = remainder; // 9 -> 99 -> 996
            i--;
        }
        
        // create a variable to hold the number
        int number = 0;
        
        // loop through the integer array, 9969
        for(int j = 0; j < 4 ; j++)
        {
            number = number *10; // 0 * 10 = 0-> 9 * 10 = 90 -> 10 * 99 = 990
            if(arr[j] == 6 && !changed){
                arr[j] = 9;
                changed = true;
            }
            number = (number + arr[j]); // 0 + 9 = 9 -> 90 + 9 = 99
        }
        // return the result
        return number;
    }
}
