// determine if you can add an extra number to any value of the array and have that value be the 
// greatest value in the array


class Solution {
    public List<Boolean> kidsWithCandies(int[] numbers, int extraNumber) {
        
        // initalize a max element
        int max = numbers[0];
        
        // find the max element in the array
        for(int i = 0; i < numbers.length; i++) 
            // find the largest value for the array
            if (numbers[i] > max)
                max = numbers[i];
                
        // Initialize output list to determine if the result is true for each number
        List<Boolean> output = new ArrayList<>(); 
        
        // Loop through each elem to set output[i] to true or false, depending on the sum of             // numbers[i] and extraNumber
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] + extraNumber < max){
                output.add(false);
            } else{
                output.add(true);
            }
        }
        
        // return true or false
        return output;
        
    }
}
