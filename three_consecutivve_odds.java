// given an integer arrar arr, return if there are three consecutive odd numbers in the // // // // array.



class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        // set a count variable to count consecutive odds
        int count = 0;

        // loop through the array
        for(int i = 0 ; i < arr.length; i++){
        
        // if the current number is even, count is equal to 0
        if(arr[i] % 2 == 0 )
            count = 0;
        else
            // start counting to see if there's 3 consecutive odds
            count++;

            if(count == 3 )
                return true;
        }
    return false;
    }
}
