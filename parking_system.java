
/*

Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.

Implement the ParkingSystem class:

ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class. The number of slots for each parking space are given as part of the constructor.

bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the parking lot. carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively. A car can only park in a parking space of its carType. If there is no space available, return false, else park the car in that size space and return true.

input:

["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
[[1, 1, 0], [1], [2], [3], [1]]


Output
[null, true, true, false, false]

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */

class ParkingSystem {
    
    // create an int array
    int [] available;

    // constructor
    public ParkingSystem(int big, int medium, int small) {
        
    available = new int[3];
        
    // initialize the values for big, medium, small
    available[0] = big;      
    available[1] = medium;
    available[2] = small;
        
    }
    
    public boolean addCar(int carType) {
        
        // carType -1 since the available goes from 0 - 2
        // subtract 1 since the spot is taken
        available[carType-1] -= 1;
        
        // return true or false depending if a spot is available
        return available[carType-1] >= 0;
    }
}

