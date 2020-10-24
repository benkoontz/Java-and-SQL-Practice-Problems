// given a non empty array of integers nums, every element appears twice except for one. Find the single element.

/* Input: nums = [2,2,1]
Output: 1

add 2 -> 2
remove 2 -> null
add 1 -> 1
get(0) -> 1
*/

class Solution {
    public int singleNumber(int[] nums) {
        
        // create an array list to hold no duplicates
        List<Integer> no_duplicates = new ArrayList<>();
        
        // loop through nums
        for(int i : nums) {
            // if the number is new then add it
            if(!no_duplicates.contains(i)) {
                no_duplicates.add(i);
            } 
            // if the numer is already in the array then remove it
            else {
                no_duplicates.remove(new Integer(i));
            }
        }
        return no_duplicates.get(0);
    }
}
