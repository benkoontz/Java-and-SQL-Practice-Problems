// you are given two arrays startTime and endTime. The first element in the first array reprents
// the time the first student started homework and the first element in the 2nd arrary
// reporesent the time the first student ended homework. Each student is represented by each place
// in each array from 1 to n. The query time represent the time of day the student was doing 
// homework

/*
Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
Output: 1

since 4 is between 3 and 7

Input: startTime = [4], endTime = [4], queryTime = 4
Output: 1

since 4 is included in the end time

*/


class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        
       // track the number of students studying at the queryTime
        int students = 0;
        
        // loop through the start time array
        // you only have to loop through one array because you can compare the indexes of both
        // since the length is the same
        for(int i = 0; i < startTime.length; i++)
        {
			// check if startTime is equal to or less than queryTime and endTime is equal to or             // greater than queryTime
            if((startTime[i] <= queryTime) && (endTime[i] >= queryTime)) 
            {                                       // 3 <= 4 && 7 >= 4
				//increment studying variable by 1
                students++;
            }
        }
        
        // reutrn the number of students studying
        return students;
    }
}
