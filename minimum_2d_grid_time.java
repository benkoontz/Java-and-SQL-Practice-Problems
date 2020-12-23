
// on a 2d plan, there are n points with integer coordinates point[i] = [xi, yi].Return the minimum time to visit
// all points in the order given by the points.

// in 1 seond you can either move veritically by one unit, move horizontally by one unit or move diagnoally 
// sqrt 2 units.

// you have to visit the pointsin the same order as they appear in the array

// you are allowed to pass throughthepointsthat appear later in the order, but these donot count as visits


class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        
    /*
    
      int[][] foo = new int[][] {
        new int[] { 1, 2, 3 },
        new int[] { 1, 2, 3, 4},
    };

    System.out.println(foo.length); //2
    System.out.println(foo[0].length); //3
    System.out.println(foo[1].length); //4
}
    */
        
     // create a variable to hold the length of the 2d array
     int n = points.length;
        
     // set the result equal to 0
     int result = 0;
        
        // loop through the array
        // [[1,1],[3,4],[-1,0]] example
        for (int i = 1; i < n; ++i) {
            
            // set the source equal to the first arrary
            // source= [1,1]
            int[] source = points[i - 1];
            
            // set the destination equal to the next array
            // destination = [3,4]
            int[] destination = points[i];
            
            // create a varible to hold the horizontal value
            // 3 - 1 -> 2
            int horizontal = Math.abs(destination[0] - source[0]);
            
            // create a variable to hold the vertical value
            // 4 - 1 -> 3
            int vertical = Math.abs(destination[1] - source[1]);
            
            // set the resulat equal to the minimum  of horizontal and vertical + the absolute value of                     // horizontal - verical
            // 2 + 1 -> 3
            result += Math.min(horizontal, vertical) + Math.abs(horizontal - vertical);
        }
        
        // return the result
        return result;
    }
}
