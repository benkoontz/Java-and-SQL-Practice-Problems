// You're given strings J representing the types of stones that are jewels, and s representing // the stones you have. Each character in s is a type of stone you have. You want to know how // // many of the stones you have are also jewels.

// example input: J = "aAB", S = "aAAbbbb"
// ouput: 3


class Solution {
    public int numJewelsInStones(String J, String S) {
        
        // set a variable to hold the answer
        int answer = 0;
        
        // creaate a for loop to loop through the stones you have
        for(int i = 0; i < S.length(); i++){
            
            // create a for loop to loop through the jewels
            for(int j = 0; j < J.length(); j++){
                
                // if the jewel matched the stone you have then add 1 to the answer
                if(J.charAt(j) == S.charAt(i)){
                    
                    // add one to the answer
                    answer ++;
                   break;
                }
            }
        }
        
        // return the total number of Jewels that are in the stones you have
        return answer;
    }
}
