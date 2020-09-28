// design a mechanism that wil run the methods in the following order every time

// first() , second(), third()


/* 

Input: [1,2,3]
Output: "firstsecondthird"

*/

// solution: use scynchronized methods
// Scynchronization is the process of controlling which threads can run at a given time.

class Foo {
    
    public int count;
    
    public Foo() { // create a constructor and set the count to 1
        this.count = 1;
    }
        

    synchronized public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        this.count++;
        notifyAll();
    }

    synchronized public void second(Runnable printSecond) throws InterruptedException {
        
        while(count != 2) wait();
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        this.count++;
        notifyAll();
    }

    synchronized public void third(Runnable printThird) throws InterruptedException {
        
        while(count != 3) wait();
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        this.count++;
        notifyAll();
    }
}




